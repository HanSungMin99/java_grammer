package C02ClassBasic;

public class C0207FunctionCall {
    //함수가 함수를 당연히 호출할 수 있다.
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }

    public static void function1(){
        System.out.println("f1 시작");
        function2();
        //함수가 자기자신을 호출하는 함수일 경우, 이를 재귀함수라 부른다.
        //재귀함수에 종료 로직이 없는 경우 스택 메모리에 함수가 무한히 쌓여 스택오버플로우 에러가 발생
        //function1();//function2 대신 function1을 넣으면 StackOverFlowError 생긴다.
        System.out.println("f1 종료");
    }
    public static void function2(){
        System.out.println("f2 시작");
        System.out.println("f2 종료");
    }
}

//함수 호출 구조가 stack으로 되어있다고 얘기함: 먼저 쌓인게 나중에 나간다.
//실행시작은 main함수가 가장 먼저 시작되지만, 종료는 f2가 가장 먼저 종료 된다.

