//LC412_Fizz Buzz
//Date : 1/1/2025
//Level : Easy
//Approach: ArrayList
//Note: 이거 *** OA sample test에 나온 문제임
//Runtime: alternative보다 original이 더 빠름. 1 ms (beats 99.84%) vs 4 ms (beats 4%)

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>(n);

        //arrayList starts with index 1
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }

        }

        return answer; //꼭 여기에 있어야함 필수
    }
}


//alternative
class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>(n);

        //arrayList starts with index 1
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = "";

            if (divisibleBy3) {
                currStr += "Fizz";
            }

            if (divisibleBy5) {
                currStr += "Buzz";
            }

            if (currStr.isEmpty()) {
                currStr += String.valueOf(i);
            }
            answer.add(currStr);
        }
            return answer;

    //Time complexity = O(n)
    //Space complexity = O(1)

    }

}