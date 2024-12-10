package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        //map은 index요소가 없으므로, 순서가 무의미하다.
//        //key값은 중복되지 않고(2개 이상 존재하지 않고), 만약에 동일한 key값으로 다른 value를 넣으면, value를 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);
//
//        //map은 key를 통해 value를 get
//        //index가 없다. key가 사실 index와 같은 역할을 한다. 따라서 key는 중복없이 유일해야 한다.
//        Map<String, String> sports2 = new HashMap<>();
//        sports2.put("basketball", "농구");
//        sports2.put("soccer", "축구");
//        sports2.put("baseball", "야구");
//        System.out.println(sports2);
//        //map에서 key값을 통한 복잡도는 O(1)
//        System.out.println(sports2.get("baseball"));
//
//        //map의 전체 데이터 조회
//        //keySet(): map의 key목록을 리턴하는 메서드
//        //values(): map의 value목록을 리턴하는 메서드
//        System.out.println(sports);
//        for(String key : sports.keySet()) { //sports에 있는 모든 키 목록을 꺼낸다.
//            System.out.println("sports의 key값은 " + key); // key값 출력
//            System.out.println("sports의 value값은 " + sports.get(key)); //value값 출력
//        }
//
//        //remove: 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
//        //putIfAbsent: key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("baseball", "야구");
//        System.out.println(sports);
//
//        //값이 없는 경우에 null이 출력된다.
//        System.out.println(sports.get("pingpong"));
//        //getOrDefault: key가 없으면 defalut 값으로 return
//        System.out.println(sports.getOrDefault("pingpong", "그런키없음"));// 없기 때문에 디폴트값 나옴
//        System.out.println(sports.getOrDefault("baseball", "그런거없음"));// baseball은 있기 때문에 value값인 야구 출력됨
//
//        //containsKey: 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));

//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        // 농구: 2, 축구: 2, 야구: 1
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a : arr){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1);
//            }else {
//                myMap.put(a,1);
//            }
//        }
//        System.out.println(myMap);
//        //getOrDefault 이용해서 푸는 방법
//        Map<String, Integer> myMap2 = new HashMap<>();
//        for (String a : arr) {
//            myMap2.put(a, myMap2.getOrDefault(a, 0) + 1);
//        }
//        System.out.println(myMap2);

//        //프로그래머스 - 완주하지 못한 선수
//
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        //프로그래머스 - 의상

//        //LinkedHashMap: 데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for(String l : linkedMap.keySet()){
//            System.out.println("KEY값은 "+l);
//        }


//        //TreeMap: key를 통해 데이터를 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for(String l : treeMap.keySet()){
//            System.out.println("KEY값은 "+l);
//        }

//        //Hash맵을 사용해서 key로 정렬
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        List<String> myList = new ArrayList<>();
//        for(String a : myMap.keySet()){
//            myList.add(a);
//        }
//        Collections.sort(myList);
//        for(String l : myList){
//            System.out.println("KEY값은 "+ l);
//            System.out.println("VALUE값은 " + myMap.get(l));
//        }
//        System.out.println(myList);
//
//        //key값으로 정렬하지 않고 value값으로 정렬하고 싶다면 아래와 같은 방법 이용 가능
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2); //오름차순 정렬 o2.compareTo(o1)은 내림차순 정렬
//            }
//        });
//        System.out.println(myList);
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1) - myMap.get(o2); //value값으로 오름차순 정렬, myMap.get(o2) - myMap.get(o1)은 value를 기준으로 내림차순 정렬
//            }
//        });
//        System.out.println(myList);

//        //hashmap출력방법 2가지:
//        // 1.강화된 for문
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        for(String a : myMap.keySet()){
//            System.out.println(a);
//        }
//        //2.iterator
//        Iterator<String> myIters = myMap.keySet().iterator();
//        //next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(myIters.next());
//        //hasNext는 iterator 안에 그 다음값이 있는지 없는지 boolean return
//        while (myIters.hasNext()){
//            System.out.println(myIters.next());
//        }
    }
}
