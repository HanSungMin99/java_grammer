package C02ClassBasic;

import java.util.*;

public class C0209RecursiveCombinationPermutation {
    public static void main(String[] args) {
//        //숫자가 1,2,3,4가 있을 때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        //myList로 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담아서 출력
//        //출력값: [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
//        List<List<Integer>> answer = new ArrayList<>(); //결과를 담을 이중리스트 만들기
//        for (int i = 0; i<myList.size(); i++){
//            for(int j = i+1; j<myList.size(); j++){
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                answer.add(temp);
//            }
//        }
//        System.out.println(answer);
//
//        //재귀함수로 만들기 위해 코드 변경: for문을 파고, 파고 들어가기 위해서
//        List<List<Integer>> answer2 = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            for(int j = i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                //answer2.add(temp);//이렇게 넣으면 깡통이 나온다.
//                answer2.add(new ArrayList<>(temp));//따라서 이렇게 입력해야 한다
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(answer2);

//    //조합
//        //재귀함수 호출을 통한 조합리스트 만들기
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> answer = new ArrayList<>();  // 결과를 저장할 리스트
//        List<Integer> temp = new ArrayList<>();  // 현재 조합을 저장할 리스트
//        // 재귀 함수 호출: myList에서 2개를 선택
//        combi(answer, temp, myList, 0, 2);
//        // 결과 출력
//        System.out.println(answer);
//    }
//        // 재귀 함수: myList에서 count 개의 원소를 선택하는 조합을 구함
//        public static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int start, int count) {
//        // 기저 조건: 선택된 원소의 개수가 count에 도달하면 결과 리스트에 추가
//        if (temp.size() == count) {
//            answer.add(new ArrayList<>(temp));  // 현재 조합을 결과에 추가
//            return;
//        }
//        // 재귀적으로 조합을 생성
//        for (int i = start; i < myList.size(); i++) {
//            temp.add(myList.get(i));  // 원소 추가
//            combi(answer, temp, myList, i + 1, count);  // 재귀 호출: 다음 원소를 선택
//            temp.remove(temp.size() - 1);  // 원소 제거 (백트래킹)
//        }
//    }

    //순열
        //재귀함수 호출을 통한 조합리스트 만들기
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> answer = new ArrayList<>();  // 결과를 저장할 리스트
        List<Integer> temp = new ArrayList<>();  // 현재 순열을 저장할 리스트
        // 재귀 함수 호출: myList에서 2개를 선택
        permu(answer, temp, myList,2, new boolean[myList.size()]);
        // 결과 출력
        System.out.println(answer);
    }
        public static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited) {
        // 기저 조건: 선택된 원소의 개수가 count에 도달하면 결과 리스트에 추가
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));  // 현재 순열을 결과에 추가
            return;
        }
        // 재귀적으로 순열을 생성\
            for (int i = 0; i < myList.size(); i++) {//원소가 이미 사용되었으면 넘어감
                if (!visited[i]) {
                    temp.add(myList.get(i));
                    visited[i] = true;
                    permu(answer, temp, myList, count, visited);
                    temp.remove(temp.size() - 1);
                    visited[i] = false; //백트레킹;
                }
            }
        }



    //백준: N과 M (15649), 로또(6603) 풀기


}
