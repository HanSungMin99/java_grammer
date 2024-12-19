package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

//매우 중요한 부분, 스프링에서도 계속 사용됨.
//에러 → 예외
//정석적인 예외처리 방법도 알아야 한다.
//하지만 에러를 무조건 막는 것이 아니라 에러를 적절히 일부러 발생하게 해야 한다.
public class C0701Exception {
    public static void main(String[] args) {

//        //일반적인 예외처리 방식
//        System.out.println("나눗셈 프로그래밍입니다.");
//        Scanner sc = new Scanner(System.in);
//        //예외가 발생할 것으로 예상되는 코드에 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;//분모에 0이 들어가게 되면 예외(에러)가 발생한다.(by zero)
//            System.out.println("두 수를 나눈값은 " + result);
//        }catch (ArithmeticException error) {
//            System.out.println("0으로 나누시면 안됩니다."); //사용자에게 에러발생과 관련된 경고메시지 알려주기. 팝업창에 남겨 사용자가 웹브라우저에서 보게 하기
//            error.printStackTrace(); //사용자한테 보여줄 필요없음. 터미널창에 남겨 개발자가 보게 함. 에러파일로 에러 발생 사유를 모아둔다.
//        }catch (NumberFormatException error){
//            System.out.println("문자를 입력하시면 안됩니다."); //사용자에게 에러발생과 관련된 경고메시지 알려주기.
//            error.printStackTrace();
//            //Exception 클래스는 모든 예외의 조상 클래스
//        }catch (Exception a){ //구체적으로 지정한 에러 외의 다른 모든 에러 전부다 여기로 빠진다.
//                              //상황에 따른 적절한 메시지가 나가지 않는다는 문제점이 있어 발생가능한 다른 에러는 상세히 분류하고 예상치 못한 것만 여기서 처리
//            System.out.println("예상치 못한 예외가 발생했습니다.");
//            a.printStackTrace(); //자세한 에러 로그 저장
//            System.out.println(a.getMessage()); //에러메시지만 따로 저장
//        }finally { //finally는 예외가 발생하든 하지 않든 무조건 실행되는 구문
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다."); //try&catch 사용하면 프로그램 중단되지 않고 아래로 계속 이어진다.


        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        //login(password);

        //checked exception의 경우에 예외처리를 위임받게 되면, 반드시 예외처리를 해줘야 함.
        try {
            login2(password);
        }catch (SQLException a){
            a.printStackTrace();
            System.out.println("에러 메시지: " + a.getMessage()); //예외문구만 따로 떼고 싶을때 getMessage() 사용
        }

    }

    //throws 키워드를 통해 예외를 위임. 다만, unchecked예외에서는 예외가 강제가 아니므로 throws가 큰 의미가 없음
    static void login(String pw) throws IllegalArgumentException{
        if(pw.length()<10){
            System.out.println("비밀번호 길이가 너무 짧습니다.");
            //throw new: 예외를 강제로 발생
            //unchecked예외는 예외처리가 강제되지 않음
            //예외는 기본적으로 메서드를 호출한 쪽으로 전파가 된다.
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }else {
            System.out.println("로그인 되었습니다.");
        }
    }

    static void login2(String pw) throws SQLException {
        if (pw.length() < 10) {
            System.out.println("비밀번호 길이가 너무 짧습니다.");
            //checkeed exception은 예외처리가 강제된다.
            //해당 메서드 내에서 예외처리를 하든, 예외를 throws 해줘야함.
            throw new SQLException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }
}

//예외처리: try&catch
//강제예외발생: throw new, throws
//checked exception: db조회, 파일 읽기 → 예외처리가 강제된다.
//unchecked exception
