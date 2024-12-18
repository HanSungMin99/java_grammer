package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {
//        //Math.random(): 0.0~1.0 사이의 임의의 double형을 반환
//        System.out.println(Math.random());
//        //로또 번호 7개 뽑아보기. 0~99까지의 임의의 숫자
//        for(int i=0; i<7; i++){
//            System.out.println((int)(Math.random()*100));
//        }

//        //Math.abs(): 절대값 반환
//        System.out.println(Math.abs(-5));

//        //Math.ceil(): 올림, Math.floor(): 내림, Math.round: 반올림
//        System.out.println(Math.ceil(5.7)); //6
//        System.out.println(Math.floor(5.7)); //5
//        System.out.println(Math.round(5.7)); //6
//
//        //min, max
//        System.out.println(Math.max(5,8));
//        System.out.println(Math.min(5,8));
//
//        //Math.pow(a,b): a의 b제곱
//        System.out.println(Math.pow(5,3));//125
//
//        //Math.sqrt(): 제곱근, 루트를 씌우는 것
//        System.out.println(Math.sqrt(25)); //5

        //소수구하기
        int n = 100;
        //방법1
        for(int i=2; i*i<=100; i++){
            if(n%i==0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
        //방법2
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
    }
}
