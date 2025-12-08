//LC345 - Reverse Vowels of a String
//Date : 12/7/2025
//Level : Easy
//Approach: Two pointers; swap vowels only. O(n), use char array.
//Note: isVowel checks via lowercase
//Runtime: 3 ms (beats 84.50%)

class Solution {
    public String reverseVowels(String s) {

        //투포인터로 모음만 골라서 바꿔 끼우기. O(n). char array.
        //left가 vowel이 아닐 때까지 >, right가 vowel이 아닐 때까지 < 이동

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1; //primitive라서 length() 아님

        while (left < right) {
            while (left < right && !isVowel(arr[left])) left++;
            while (left < right && !isVowel(arr[right])) right--;

            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
        return new String(arr);
    }

    private boolean isVowel (char c) {
        //모음을 소문자 기준으로만 비교하기 위해서 lowercase 사용

        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o'; //aiueo... aeiou가 나을수도?


    }



}