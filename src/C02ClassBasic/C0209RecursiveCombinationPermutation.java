package C02ClassBasic;

import java.util.*;

public class C0209RecursiveCombinationPermutation {
    public static void main(String[] args) {
        //숫자가 1,2,3,4가 있을 때
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        //myList로 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담아서 출력
        //출력값: [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
        List<List<Integer>> answer = new ArrayList<>(); //결과를 담을 이중리스트 만들기
        for (int i = 0; i<myList.size(); i++){
            for(int j = i+1; j<myList.size(); j++){
                List<Integer> temp = new ArrayList<>();
                temp.add(myList.get(i));
                temp.add(myList.get(j));
                answer.add(temp);
            }
        }
        System.out.println(answer);

        //재귀함수로 만들기 위해 코드 변경: for문을 파고, 파고 들어가기 위해서
        List<List<Integer>> answer2 = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i<myList.size(); i++){
            temp.add(myList.get(i));
            for(int j = i+1; j<myList.size(); j++){
                temp.add(myList.get(j));
                //answer2.add(temp);//이렇게 넣으면 깡통이 나온다.
                answer2.add(new ArrayList<>(temp));//따라서 이렇게 입력해야 한다
                temp.remove(temp.size()-1);
            }
            temp.remove(temp.size()-1);
        }
        System.out.println(answer2);

    }
}
