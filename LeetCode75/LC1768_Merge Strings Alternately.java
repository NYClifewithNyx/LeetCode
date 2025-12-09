//LC345 - Reverse Vowels of a String
//Date : 12/7/2025
//Level : Easy
//Approach: Two pointers; swap vowels only. O(n), use char array.
//Note: isVowel checks via lowercase
//Runtime: 3 ms (beats 84.50%)

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder(); //class already exists in JDK to add the Strings

        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i++)); //java does not allow indexing for String. so char(index) ~= word1[i] = arr[0] == word1.charAt(0)
                                                //java String is immutable = read only.

            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j++));

            }
        }
        return sb.toString(); //combine



    }
}