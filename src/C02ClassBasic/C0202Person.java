package C02ClassBasic;

public class C0202Person {
    //private접근제어자는 해당 클래스 내에서만 접근 가능
    //클래스에서 객체변수는 일반적으로 변수의 안전성을 위해 private로 설정
    private String name;
    private int age;
    private String email;


    //아래와 같이 직접 만들 필요없이 마우스 오른쪽 우클릭 'Generate' → Getter and Setter로 만들면 된다.
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //생성자: 초기값 → 그 이후에 값이 변경될 경우 setter와 같은 역할을 하는 메서드 필요
    //예) 회원가입: 생성자, 회원수정: setter 필요, 주문: 생성자, 재고관리:setter필요




    public void eating(){
        System.out.println(this.name+"님이 밥을 먹고 있습니다.");
    }

    public String whoIs(){
        String result = "이름은 : " + this.name + "나이는 : " + this.age + " email은 " + this.email;
        return result;
    }
}
