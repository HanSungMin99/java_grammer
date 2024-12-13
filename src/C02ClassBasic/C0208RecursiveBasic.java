package C02ClassBasic;

public class C0208RecursiveBasic {
    //프로그램 반복 사용 시
    //1. 반복문 사용: while문, for문,  반복횟수 제한(for)
    //2. 재귀함수 사용: 반복횟수 제한해야 한다. 실용적인 것은 떨어짐
    public static void main(String[] args) {
        int total = 0;
        //for문으로 1~10까지 누적합계
        for(int i =1 ; i<11 ; i++){
            total += i;
        }
        System.out.println(total);

        //재귀함수로 1~10까지 누적합계
        System.out.println(sumAcc(10));

        //factorial 값 구하기: 1~n까지의 숫자를 모두 곱한 값
        //factorial(5) → 1*2*3*4*5
        System.out.println(factorial(5));

        //피보나치 수열 구현: 100번째를 구해라
        // 1 1 2 3 5 8 13 21 ...
        //배열로 풀기
        int[] arr = new int[10];
        arr[0] =1;
        arr[1] =1;
        for(int i=2; i<10; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[9]);
        //재귀함수로 풀기; 구한 것을 또 구하고 있기 때문에 2^n만큼 중복이 발생. 따라서 재귀함수로 푸는 것이 적합하지 않음
        //그럼 미리 구해놓은 것을 기억해놓으면 된다 → 배열로 저장 → dp알고리즘으로 푸는 것이 더 좋음
        System.out.println(fibonacci(10));
    }

    public static int sumAcc(int n){
        if(n==1){
            return 1;//return은 함수를 강제종료 시킴, 아래 sumAcc있는 로직으로 내려가지 않는다.
        }//종료로직: 중간에 stop시켜주는 로직 추가
        return n+sumAcc(n-1); //이렇게만 호출하면 StackOverFlowError 나거나 -int끝까지 간다. 따라서 중간에 stop시켜주는 로직이 필요함
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
