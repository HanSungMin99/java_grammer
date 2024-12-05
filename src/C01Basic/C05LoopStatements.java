package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while (a<10) {
//            System.out.println("hello world");
//            a = a+1;
//        }

//        //2~10까지 출력하는 while문 예제
//        int a = 2;
//        while (a<=10) {
//            System.out.println(a);
//            a = a+1;
//        }
//        //다른 풀이법
//        int b = 2;
//        while (b<11){
//            System.out.println(b);
//            b++;
//        }

//        //입력한 숫자의 구구단 단수 출력
//        while (true){
//            System.out.println("단수를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            int input =sc.nextInt();
//            int a = 1;
//            while (a<10) {
//                System.out.println(input + " X " + a + " = " + input * a);
//                a++;
//            }
//        }

//        //도어락키 예제 → 무한반복되는 도어락키 예제
//       while(true){
//           int answer = 1234;
//           Scanner sc = new Scanner(System.in);
//           int input = sc.nextInt();
//           if(answer == input){
//               System.out.println("문이 열렸습니다.");
//           } else  {
//               System.out.println("비밀번호가 틀렸습니다.");
//           }
//       }

//        //도어락키 예제 → 무한반복되는 도어락키 예제
//        int a = 0;
//        while(a<5){
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input){
//                System.out.println("문이 열렸습니다.");
//                //break키워드는 가장 가까이에 있는 반복문을 종료
//                break;
//            } else  {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//        }

//        //도어락키 예제 → 무한반복되는 도어락키 예제-두번째 방법
//        int a = 0;
//        while(true){
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input){
//                System.out.println("문이 열렸습니다.");
//                //break키워드는 가장 가까이에 있는 반복문을 종료
//                break;
//            } else  {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("5회이상 초과");
//                break;
//            }
//        }

//        //do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        }
//        while (a<10);

//        //for문: 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        //while문을
//        int b = 2;
//        while (b<11){
//            System.out.println(b);
//            b++;
//        }
//        //for문으로 변화해주기
//        for(int a=2; a<11; a++){
//            System.out.println(a);
//        }
//
//        //for문은 사용했던 변수명을 for문 끝난 이후 다음 라인에서 재선언이 가능하다.
//        //그 이유는 자바의 유효범위 때문이다.


//        //1~10중에 홀수만 출력하기
//        for(int i=1; i<11; i++){
//            if(i%2 != 0) {
//                System.out.println(i);
//            }
//        }

//        //1~20까지 수 중에 짝수를 모두 더한 값
//        int total = 0;
//        for(int i=1; i<21; i++){
//            if(i%2 ==0){
//                total += i;
//            }
//        }
//        System.out.println(total);
//
//        //두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a < b ? a : b;
//        int answer = 0;
//        for(int i=1; i<=min; i++){
//            if(a%i ==0 && b%i ==0){
//                answer=i;
//            }
//        }
//        System.out.println(answer);
//
//
//        //소수구하기: 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        //사용자가 입력한 숫자 n이 소수인지 아닌지 판별 //가정: 2도 소수에서 제외된다.
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for(int i=2; i*i<=input; i++){ //for(int i=2; i<Math.sqrt(input); i++)
//            if(input%i == 0){
//                answer = true;
//                break;
//            }
//        }
//        if(answer==true){
//            System.out.println("소수가 아닙니다.");
//        }else {
//            System.out.println("소수 입니다.");
//        }
//
//        //continue: 반복문의 조건식으로 이동
//        //continue를 활용하여 홀수만 출력
//        for(int i=1; i<11; i++){
//            if(i%2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        //배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        //일반 for문으로 배열 접근
//        for(int i=0; i<4; i++){
//            System.out.println(arr[i]);
//        }
//        //향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정
//        for(int a : arr ){
//            System.out.println(a);
//        }
//        //일반 for문을 통해 arr의 저장된 값 변경
//        for(int i=0; i<4; i++){
//            arr[i] += 10;
//        }
//        //System.out.println(arr); //arr을 그냥 출력하면 메모리 주소값이 출력된다.
//        System.out.println(Arrays.toString(arr));// 메모리 주소에서 값을 뽑아와서 출력해주는 메소드
//        //향상된 for문을 arr값 변경 시도 → 변경되지 않음
//        for(int a : arr){
//            a += 100;
//        }
//        System.out.println(Arrays.toString(arr));


//        //자바 변수의 유효범위: {}
//        int num = 10;
//        if (num > 1) {
//            int abc=20;
//            num=20;
//        }
//         // abc=30; //if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);

//        //다중반복문
//        //기본 개념 먼저
//        for(int i=0; i<5; i++){
//            for(int j=0; j<10; j++){//여기서는 i로 변수 선언할 수 없음
//                System.out.println("hello world");// hello world 가 50개 출력됨
//            }
//        }
//        //2단~9단까지 출력
//        for(int i=2; i<10; i++){
//            System.out.println(i+"단 입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i + "X" + j + "=" + i*j);
//            }
//        }
//
//        //라벨문: 반복문에 이름을 붙이는 것
//        boolean end = false;
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//                if( j == 2){
//                    end = true;
//                    break;
//                }
//            }
//            if( end == true){
//                break;
//            }
//        }


//        //
//        int[][] arr = {{1,2,3},{4,5,11},{7,8,9}, {10,11,12}};
//        //숫자 8을 찾아서 2,1에 있다고 출력
//        for(int i=0; i<4; i++){
//            for(int j=0; j<3; j++){
//                if(arr[i][j]==8){
//                    System.out.println(i+", "+j+"에 있습니다.");
//                }
//            }
//        }
//        //숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
//        boolean end = false;
//        for(int i=0; i<4; i++){
//            for(int j=0; j<3; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j + "에 있습니다.");
//                   end =true;
//                   break ;
//                }
//            }
//            //if(end)break;도 가능
//            if(end == true)
//                break;
//        }
//        //같은 문제 loop 이용해서 해결하기
//        loop1:
//        for(int i=0; i<4; i++){
//            loop2:
//            for(int j=0; j<3; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j + "에 있습니다.");
//                    break loop1;
//                }
//            }
//        }

//        //100~200까지 수 중에서 가장 작은 소수를 출력
//        for(int input=100; input<=200; input++){
//            boolean answer=false;
//            for(int i=2; i*i<=input;i++){
//                if(input % i == 0){
//                    answer = true;
//                    break;
//                }
//            }
//            if(!answer){
//                System.out.println(input);
//                break;
//            }
//        }






    }
}
