//LC283 - Move Zeros
//Date : 12/8/2025
//Level : Easy
//Approach: Two pointers - relative order (Slow-fast pattern)
//Note: slow - when non-zero is found, move 1 more ; fast - from 0 to end, run fast once. Linear fast (search) pointer & slow (result) pointer
//Runtime: 2 ms (beats 85.71%)

class Solution {
    public void moveZeroes(int[] nums) {

        int slow = 0;

        //1) non-zero들 앞으로 몰아넣기

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast]; //slow 인덱스 위치에 fast 인덱스 값을 넣고, slow를 1 증가시켜라

            }
        }

        //2) 나머지 자리를 0으로 채우기
        while (slow < nums.length) {
            nums[slow++] = 0;
        }



    }
}