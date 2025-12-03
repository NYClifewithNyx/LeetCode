//LC13 - Roman to Integer
//Date : 12/2/2025
//Level : Easy
//Approach: scan from left > right for each char. Compare its value with the next char. if current < next, subtract current.
//          otherwise, add current. This naturally handles subtractive pairs like IV, IX, XL, XC, CD and CM.
//Note: Time O(n), Space O(1). n = lenght of the Roman # string.
//Runtime: 3 ms (beats 79.38%)

class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = valueOf(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = valueOf(s.charAt(i + 1));

                if (current < next) {
                    // Subtractive case, e.g. IV, IX, XL, XC, CD, CM
                    total -= current;

                } else {
                    //last char always added
                    total += current;

                }
            } else {
                total += current;

            }
        }
        return total;
    }


    private int valueOf(char c) { //class Solution inside, but outter of public int romanToInt(String s)
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
