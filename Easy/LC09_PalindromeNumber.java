//LC09 - Palindrome Number
//Date : 12/1/2025
//Level : Easy
//Approach: convert int to String and use two-pointer comprison (left <-> right)
//Note: learned two-pointer movement; compared characters from both ends toward the center
//Runtime: 7ms (beats 16.43%)

class Solution {
    public boolean isPalindrome(int x) {
        //negative numbers cannot be Palindrome; palindrome = xyzyx something like this in mirror

        if (x < 0 || (x % 10 == 0 && x !=0)) return false;

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}



class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) return false; //negative number cannot be palindrome
        //also, 0xyx0 < does not work. so if x % 10 == 0 (x can be devided x), then x cannot be 0. so (x % 10 == 0 && x != 0).

        String s = String.valueOf(x); //x is in number as int x. Make it into string.

        //int left = 0, right = s.length() - 1; //comma can help like int a, b, c...
        // this is same as int left = 0; int right = s.length() - 1;
        // left = array[0], right = array[x - 1] b/c array starts at 0 all the time.

        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false; //if array[0] != array[x - 1], obviously not a palindrome so false.
            left++; //do this comparing from left > right
            right--; //do this comparing from right > left

        }

        return true;
    }

}