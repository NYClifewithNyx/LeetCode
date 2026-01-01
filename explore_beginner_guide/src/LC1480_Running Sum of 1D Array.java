//LC1480_Running Sum of 1D Array
//Date : 12/31/2025
//Level : Easy
//Approach: results[i] = nums[i] + results[i - 1];
//Note: add the previous result to the next index value in the given array
//Runtime: 0 ms (beats 100.00%)

class Solution {

    public int[] runningSum(int[] nums) {

        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            results[i] = nums[i] + results[i - 1];

        }

        return results;

    }

}