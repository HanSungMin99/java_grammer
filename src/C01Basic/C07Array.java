package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        //배열표현식1. 리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
//        //배열표현식2. 배열 선언 후 할당방식, 먼저 선언 후에 값 입력, 실전에서는 이것을 훨씬 많이 사용
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); //0으로 초기화되기 때문이다.

//        //참조자료형의 배열은 기본적으로 null로 초기화
//        String[] stArr = new String[5];
//        stArr[0]="hello1";
//        stArr[1]="hello2";
//        stArr[2]="hello3";
//        for(int i=0; i<stArr.length; i++){
//            if(stArr[i].equals("hello2")){
//                System.out.println("hello2가 있습니다."); // "hello2가 있습니다" 출력후 nullpointException발생,
//                                                       // if 후 break를 써도 되지만 그것은 내가 모든 자료를 알고있다는 가정인데 그것은 사실상 어려움
//                                                       // 따라서, if(stArr[i] != null && stArr[i].equals("hello2"))의 방식으로 작성하여 null값 제외
//            }
//        }

//        // 아래코드는 nullpointerException 발생
//        for(int i=0; i<stArr.length; i++){
//            if(stArr[i].equals("hello10")){
//                System.out.println("hello10가 있습니다.");
//            }
//        }


//        //표현식3
//        int[] intArr3 = new int[] {1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,3,5,7,9})

//        //표현식4: 불가 → 배열의 길이가 사전 지정되어야 함.
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        for(int i=0; i<stArr.length; i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

//        //85, 65, 90인 int배열을 선언하고, 총합, 평균을 구하자.
//        int[] intArr = new int[] {85, 65, 90};
//        System.out.println(Arrays.stream(intArr).sum());
//        System.out.println(Arrays.stream(intArr).average().getAsDouble());
//
//        int[] arr1 = {85, 65, 90};
//        int total = 0;
//        for(int i=0; i<arr1.length; i++){
//            total += arr1[i];
//        }
//        System.out.println(total);
//        System.out.println((double)total/arr1.length);

//        //배열의 최대값, 최소값 구하기
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = arr2[0];
//        int min = arr2[0];
//        for(int i=0; i<arr2.length; i++){
//            if(arr2[i]>max){
//                max=arr2[i];
//            }
//            if(arr2[i]<min){
//                min=arr2[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        //또 다른 방법: Integer.MIN_VALUE; 와 Integer.MAX_VALUE는 다른 곳에서도 많이 쓰이므로 알아두면 좋다.
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr2.length; i++){
//            if(arr2[i]>max){
//                max=arr2[i];
//            }
//            if(arr2[i]<min){
//                min=arr2[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

//        //배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//       //배열의 자리 바꾸기2
//        int[] arr2 = {10,20,30,40,50};
//        for(int i=0; i<arr2.length-1; i++){
//            int temp2 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//        System.out.println(Arrays.toString(arr2));

//        //배열 뒤집기: 새로운 배열을 선언하여, arr을 뒤집을 배열을 생성
//        //앞에서부터 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            newArr[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//        //뒤에서부터 가져오기
//        int[] arr2 = {10,20,30,40,50};
//        int[] newArr2 = new int[arr.length];
//        for(int i=arr2.length-1; i>=0; i--){
//            newArr[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        //이중for문 돌리면 복잡도는 n^2만큼 된다.(n은 데이터의 개수)

//        //배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        //정렬하는 기준이 들어가 있음(내장 기능: 직접 정렬보다 성능 좋음)
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        //선택정렬 알고리즘 구현
//        for(int i=0; i<arr.length-1; i++){
//            int min = arr[i];
//            int minIndex = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(min>arr[j]){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex]= temp;
//        }
//        System.out.println(Arrays.toString(arr));
        //다른 방법 풀이
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        //문자 정렬
//        //아스키코드(unicode)기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
//        //오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//        //내림차순: 기본형 타입은 Comparator로 처리 불가(숫자는 내림차순 정렬 안된다는 뜻)
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));
//        //숫자의 경우: 에러 내보기
//        //int[] arr ={5,1,2,3,6};
//        //Arrays.sort(arr, Comparator.reverseOrder());
//        //Integer로 박싱해서 처리하면 Comparator로 처리 가능
//        //헷갈리는 우선순위 확인해보기
//        String[] fruits2 = {"apple", "applee", "applef", "b"}; //무조건 b가 제일 마지막 출력, 한글자자리로 먼저 비교하기 때문
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        //프로그래머스-k번째 수
//        int[] array={1, 5, 2, 6, 3, 7, 4};
//        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//            int number=0;
//            for(int j=commands[i][0]-1; j<commands[i][1];j++){
//                temp[number] = array[j];
//                number++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//        System.out.println(Arrays.toString(answer));
//        }

//        //숫자 조합의 합
//        //모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 2개의 조합의 합을 출력
//        //중복 제거는 다른 명령어를 배워야 가능하므로 일단 중복있게 조합만들기
//        int[] intArr = {10,20,30,40,50,60};
//        int[] arr1 = new int[intArr.length * intArr.length];
//        int index = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i+1; j < intArr.length; j++) {
//                int sum = intArr[i] + intArr[j];
//                arr1 [index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        //출력 범위 맞추기
//        int[] arr2 = new int[index];
//        for(int i=0; i<index; i++){
//            arr2 [i] = arr1[i];
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        //중복 제거해보기
//        Arrays.sort(arr2);
//        int[] arr3 = new int[arr2.length];
//        int count = 0;
//        for(int i = 0; i<arr2.length; i++){
//            if(i==arr2.length-1 || arr2[i] != arr2[i+1]){
//                    arr3[count] = arr2[i];
//                    count++;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));
//
//        //배열의 복사
//        //Arrays.copyOf(배열명, length), Arrays.copy0fRange(배열명, start, end)
//        int[] answer1 = Arrays.copyOf(arr3, count);
//        int[] answer2 = Arrays.copyOfRange(arr3, 0, count);
//        System.out.println(Arrays.toString(answer1));
//        System.out.println(Arrays.toString(answer2));

        //프로그래머스-두 개 뽑아서 더하기
        int[] numbers = {2, 1, 3, 4, 1};

    }
}
