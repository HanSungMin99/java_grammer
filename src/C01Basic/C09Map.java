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

        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
        // 농구: 2, 축구: 2, 야구: 1

    }
}
