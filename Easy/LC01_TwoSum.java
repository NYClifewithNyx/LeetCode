//LC01 - Two Sum
//Date : 10/31/2025
//Level : Easy
//Approach: HashMap (value > index), single-pass
//Note: Note: Got help from ChatGPT while learning Map & HashMap basics
//Runtime: 2ms (beats 99.08%)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] {map.get(need), i};
             }
            map.put(nums[i], i);
    }
     return new int[] {};
    }
}
