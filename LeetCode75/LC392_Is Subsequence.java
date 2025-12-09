//LC283 - Is Subsequence
//Date : 12/8/2025
//Level : Easy
//Approach: Two Pointers (i for s, j for t)
//Note: j scans through t; increase i only when characters match.
//      If i reaches s.length(), all characters of s are found in order.
//Runtime: 2 ms (beats 66.61%)

class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; // pointer for s - s에서 현재 찾고 있는 문자의 위치를 가리킴. 우리가 t 안에서 이 문자를 순서대로 찾아야함
        int j = 0; // pointer for t - t 전체를 앞에서 뒤까지 훑는 역할. fast pointer처럼 계속 전진함.

        //String은 클래스라서 길이를 메서드(length())로 제공한다.
        //배열은 언어 레벨 built-in 구조라서 길이가 필드(length)에 저장되어 있다.
        //reference 타입 여부는 length/length()와 무관하다. (즉 String 설계가 그렇게 되어있어서 .length()를 사용)
        while (i < s.length() && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                i++; //match found, move s pointer
            }

            j++; //always move t pointer

        }

        //i가 s.length()와 같다면 s의 모든 문자를 순서대로 t 안에서 찾았다는 의미 → true
        //그렇지 않으면 false
        return i == s.length();


    }
}