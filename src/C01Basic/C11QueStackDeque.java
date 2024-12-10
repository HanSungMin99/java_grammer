package C01Basic;


import java.io.*;
import java.util.*;


public class C11QueStackDeque {
    public static void main(String[] args) {
//        //Queue는 뒤에서 데이터를 넣고 앞에서 데이터를 빼는 것이 가장 최적화 되어 있다.
//        //Queue 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQueue = new LinkedList<>();
//        //LinkedList는 List와 Queue 기능을 모두 구현 가능하지만, 왼쪽에 Queue라는 인터페이스를 선언하면서 LinkedList의 사용메서드를 제한함.
//        //중간에 값을 삽입하는 것은 성능이 저하된다.
//        myQueue.add(10);
//        myQueue.add(20);
//        myQueue.add(30);
//        //poll을 사용하면 myQueue에 데이터를 삭제하면서 가장 앞의 데이터를 반환한다
//        System.out.println(myQueue.poll()); //poll은 무조건 맨 앞에 있는 것을 가져옴
//        System.out.println(myQueue);
//        //myQueue의 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue);

//        //LinkedList와 ArrayList 성능 비교
//        //중간 위치에 데이터 add 테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist 삽입속도 " + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist 삽입속도 " + (endTime2-startTime2));
//
//        //조회속도 비교
//        //linkedlist조회
//        long startTime3 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList 조회속도 " + (endTime3-startTime3));
//        //ArrayList의 조회속도
//        long startTime4 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList 조회속도 " + (endTime4-startTime4));

//        //Queue
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }
//        //길이제한 큐: ArrayBlockingQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        //blockingQueue.add("문서4"); //길이 제한 때문에 에러가 발생한다
//        //offer: Queue에 여유공간이 있을 때만 add
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 길이 제한이 있어도 에러가 나지 않고, 대신 삽입도 되지 않는다.
//        System.out.println(blockingQueue);

//        //우선순위 Queue: 데이터를 꺼낼 때 정렬된 데이터 poll
//        //전체 정렬이 아닌, poll할 때마다 최소값을 보장
//        //최소값을 찾을 때 성능이 굉장히 좋다.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //이렇게 조회만 하면 정렬이 되어있지 않음
//        System.out.println(pq.poll()); //그러나 값을 꺼낼 때는 오름차순 정렬된 형태로 데이터를 꺼낸다.
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll()); //하나꺼낼때마다 log n의 복잡도를 가짐
//        }//Empty가 아닐 때까지 계속 값을 꺼냄

//        //백준 - 최소힙
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Queue<Integer> pq = new PriorityQueue<>();
//        int count = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<count; i++){
//            int temp = Integer.parseInt(br.readLine());
//            if(temp==0){
//                if(pq.isEmpty()){
//                    sb.append(0);
//                    sb.append("\n");
//                }else{
//                    sb.append(pq.poll());
//                    sb.append("\n");
//                }
//            }else {
//                pq.add(temp);
//            }
//        }
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);

//        //최대힙인 경우
//        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
//        maxPq.add(30);
//        maxPq.add(10);
//        maxPq.add(20);
//        System.out.println(maxPq.poll());


    }
}
