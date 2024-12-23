package C10Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1001Validation {
    public static void main(String[] args) throws IllegalAccessException {
        List<User> userList = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            //아래 방식의 코딩은 사용자의 입력의 필수입력을 보장하지 못함.
            //컴파일타입에서는 사용자의 입력값을 예측하는 것이 불가
            System.out.println("이름을 입력하세요");
            String name = sc.nextLine();
            System.out.println("이메일을 입력하세요");
            String email = sc.nextLine();
            User user1 = new User(name, email);
            validate(user1);
            userList.add(user1);
            System.out.println(userList); //이름, 이메일 그냥 엔터치면 깡통으로 들어가져 있는 것을 확인할 수 있음
        }
    }
    //리플렉션 기술을 통해 런타임시점에서 클래스에 접근하고, 필드 검증 및 수정까지도 가능.
    static void validate(Object object) throws IllegalAccessException {
        //<?>는 제네릭 표현으로서 어떤 클래스타입도 가능하다는 표현
        //getClass메서드를 통해 런타임시점에 user라는 객체의 타입을 가져올 수 있게 된다.
        Class<?> myClass = object.getClass();
        //변수정보 조회: 리플렉션 기술을 통해 필드 접근 및 수정 가능하다.
        Field[] fields = myClass.getDeclaredFields();
        for(Field f : fields){
            if(f.isAnnotationPresent(NotEmpty.class)){
                //field에서 값을 꺼내거나 수정하려면 private변수를 접근가능하도록 설정.
                f.setAccessible(true);
                String value = (String)f.get(object);
                if(value == null || value.isEmpty()){
                    NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                    throw new IllegalAccessException(notEmpty.message());
                }
            }
        }
    }
}

class User{
    @NotEmpty(message = "name cannot be empty") //값이 비어있으면 안된다고 명시하는 것. 이름 입력 안하면 에러가 난다.
    private String name;
    @NotEmpty //값이 비어있으면 안된다.
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

//어노테이션 클래스를 통해, 해당 클래스 명으로 특정 필드 검사, 클래스 검사, 특정기능 주입 등에 활용할 수 있다.
@Retention(RetentionPolicy.RUNTIME) //런타임시점에 동작시키겠다. 런타임시점에 NotEmpty를 동작하고 검사하겠다.
//ElementType.Field: 변수를 대상. Method: 메서드를 대상. Type: 클래스, 인터페이스 등에 적용.
@Target(ElementType.FIELD) //인터페이스 위에 있어야 한다. 인터페이스 안으로 들어가 있으면 안됨.
@interface NotEmpty {//@interface가 붙는 것이 Annotation의 일종이다.
    String message() default "this field cannot be empty"; //리턴값이 String인 message라는 메서드
}

//어노테이션: 런타임시점에 클래스,  변수 검사, 특정한 기능 주입
//리플렉션: 런타임 시점에 클래스에 접근하고, 필드에 접근
