//L1431 - Kids with the Greatest Number of Candies
//Date : 12/3/2025
//Level : Easy
//Approach: 1) Find current max candy count
// 2) For each kid, check (candies[i] + extraCandies >= max)
// 3) Add boolean result to List<Boolean>
//Note: Return type is List<Boolean>, so use ArrayList
//Runtime: 1 ms (beats 88.25%)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //public - reachable (public or private
        //List<Boolean> - return type in wrapper
        //kidsWithCandie(...) - method name
        //int[] candies - array of candies (each kid has) - array is a parameter
        //int extraCandies - # of extra candies in integers

        //이 질문 자체를 이해를 잘 못했는데, 일단 제각각 사탕을 가지고 있는 아이들이 있는데,
        //현재 상태에서 가장 최고값의 사탕의 갯수를 정한 후에 -- arrayList가 아니라서 max & indexOf를 사용할 수 없나?
        //그 갯수 + extra 사탕 갯수를 하면 현재 최고값보다 같거나 큰지 true / false 출력하게 만드는 알고리즘인 것 같음

        int max = 0;
        for (int c : candies) {
            if (c > max) max = c;
        }

        List<Boolean> result = new ArrayList<>();
        //boolean[] result = new boolean[candies.length];//boolean으로 나오는 candies라는 array의 length만큼 새로운 boolean 배열을 만들어주기 (이거 챗지가 잘못 가르쳐줌)
        //primitive는 객체(object)가 아니라 메모리에 직접 숫자/값을 저장하는 primitive (원시) 타입들. boolean, int, double, char, long, etc.
        //refernce type (참조타입, 객체) - Boolean, Integer, String, ArrayList, int[], boolean[]... 등. new 해서 프로그램 메모리에 생성됨.

        for (int i = 0; i < candies.length; i++) { //array는 .length - 괄호가 없음; String은 .length() - 괄호가 있음
            boolean canBeMax = (candies[i] + extraCandies >= max); //boolean이니까 candies[i] + extraCandies >= max가 true인지 false인지 나오는 결과값을 result[i]에 저장하라 < 챗지가 잘못 가르쳐줌
            result.add(canBeMax);
        }

        return result; //배열 전체 결과값 출력 -- 타입이 일치하지 않으면 컴파일 에러가 난다!

    }

}