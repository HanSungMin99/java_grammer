package C01Basic;

public class C06String {
    public static void main(String[] args) {
//        //참조자료형: 기본 자료형을 제외한 모든 자료형.클래스 기반
//        //WrapperClass: 기본형 타입을 Wrapping한 클래스
//        int a = 10; //a. → 기능이 없음
//        Integer b = new Integer(10); //b. → 같은 숫자지만 다양한 기능 제공
//        //오토 언박싱: WrapperClass → 기본자료형
//        int c = b;
//        //오토 박싱: 기본자료형 → WrapperClass 형변환
//        Integer d = a;

//        //String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        //st2.//클래스를 기반으로 만들어진 객체(클래스를 기반으로 만들어진 복제본)는 근본은 같지만 객체별 내용은 다를 수 있음
//             //객체메서드를 불러온다.
//
//        //메서드의 종류
//        //객체 메서드
//        //클래스 메서드(static메서드)
//
//        //String → int
//        int b = Integer.parseInt(st1);
//
//        //배열에는  원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};
//
//        //리스트에는 참조자료형 세팅
//        //참조자료형에 원시자료형을 담을 때는 Wrapper클래스를 써야 함.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//

//        String st1 = new String("hello1");
//        //리터럴 방식 허용: 권장되는 방식 → 성능이 최적화되어 있기 때문, 문자pool을 통해 성능을 향상시키고 있다.
//        String st2 = "hello1";
//        String st3 = "hello1";
//        //참조자료형이므로, ==비교는 메모리주소가 되고, 값을 비교할때에는 .equals를 사용
//        System.out.println(st1.equals(st2));
//        System.out.println(st2==st3);
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);

//        //equals 중에 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

//        //문자열의 길이: length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
//        //charAt : 특정 index의 문자(char)값을 리턴
//        //소문자 알파벳의 개수 구하기
//        int count = 0;
//        for(int i = 0; i<st1.length(); i++){
//            if(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //a의 개수가 몇개인지 출력
//        String st2 = "abcdefabaadf";
//        int count = 0;
//        for(int i = 0; i<st2.length(); i++){
//            if(st2.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //toCharArray(): String문자열을 char배열로 리턴
//        String st2 = "abcdefabaadf";
//        int count = 0;
//        char[] chArr = st2.toCharArray();
//        for(int i = 0; i<st2.length(); i++){
//            if(chArr[i] == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //toCharArray(): String문자열을 char배열로 리턴 // 향상된 for문 활용
//        String st2 = "abcdefabaadf";
//        int count = 0;
//        char[] chArr = st2.toCharArray();
//        for(char ch : chArr){
//            if(ch == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //toCharArray(): String문자열을 char배열로 리턴 // 또 다른 방법
//        String st2 = "abcdefabaadf";
//        int count = 0;
//        for(char ch : st2.toCharArray()){
//            if(ch == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);


//        //indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//        //다른 방법
//        int number = st1.indexOf("java");
//        System.out.println(number);
//
//        //contains: 특정 문자열이 있는지 여부를 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));


    }
}
