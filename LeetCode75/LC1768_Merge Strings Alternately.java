//LC1768 - Merge Strings Alternately
//Date : 12/3/2025
//Level : Easy
//Approach: Two-pointer merge. Append chars alternately.
//Note: String is immutable; use StringBuilder for efficiency
//Runtime: 1 ms (beats 86.67%)

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