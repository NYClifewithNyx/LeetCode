//LC1071 - Greatest Common Divisor of Strings
//Date : 12/4/2025
//Level : Easy
//Approach: Use string concatenation check + GCD of lengths
//Note: If (str1 + str2) != (str2 + str1), there is no common base pattern.
//Runtime: 1 ms (beats 77.93%)

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // s = t + t + ... + t + t;
        // so obviously str1 + str2 == str2 + str1 otherwise it will not make sense.

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";

        }
        // gcd = greatest common divider = 최대공약수
        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength); // as s = t + t + ... + t + t, from 0 to gcd in str1 or st2 is the "t".

    }

    //Euclidean Algorithm
    private int gcd(int x, int y) { //str1.length() & str2.length(); reason why not public - rather not called outside (for encapsulation purpose)

        while (y != 0) { //if str2.length is not 0,
            int temp = x % y; // try to divide each other
            x = y;
            y = temp;
        }
        return x;

    }

}