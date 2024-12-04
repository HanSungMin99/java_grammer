package C01Basic;
//클래스의 명명규칙
    // 1)반드시 public class명과 파일명이 일치해야 함
    // 2)일반적으로 대문자알파벳으로 시작(소문자나 숫자로 시작하지 말 것)
public class C00HelloWorld {
    // main메서드는 프로그램 실행시 가장 먼저 실행되는 메서드
    // public static: 어디에서든 접근할 수 있다.
    // void: 리턴할 값이 비어있는 경우 사용, 리턴없이 출력하는 것
    // 어디에서든 접근하고, 리턴값이 없는 것이 특징이므로 public static void를 앞에 붙임
    public static void main(String[] args) {
        //java는 프로그램의 범위를 중괄호{}로 구분짓고, 모든 명령문읜 세미클론으로 끝맺음
        System.out.println("helloworld");
        /*
        여러 줄의 주석처리시에 이와 같은 방법으로 주석 처리 가능, 주석처리는 기본적으로 컴파일에서 제외
         */
    }
}