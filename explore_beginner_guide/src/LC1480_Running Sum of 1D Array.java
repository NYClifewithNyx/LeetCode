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
//better if the original array must stay the same, not interrupted
//but inefficient compared to the alternative way

//if (nums == null || nums.length == 0) return nums; < edge case protection

//Alternative Way
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
//Time complexity = O(n)
//Space complexity = O(1) as using only 1 array

// better for space complexity, but destroys the original array, but preferred in interviews