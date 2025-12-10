//LC643 - Maximum Average Subarray I
//Date: 12/9/2025
//Level: Easy - Sliding Window
//Approach: Fixed-size sliding window; update sum by removing left and adding right, track max.
//Note: Only sum matters; use long; O(n).
//Runtime: 3 ms (beats 82.06%)

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //sliding window인 이유는 k를 fixed value로 주고 그 길이에 맞춰서 왼쪽에서 오른쪽으로 하나씩 옮겨가면서 각 창문 안에 있는 값들의 평균을 구하고, 그 중 최대를 찾으면 되기 때문.

        //1. 처음 k개 합 계산
        long sum = 0; //sum이 int를 넘을 수 있어서 씀. overflow 방지.
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        long maxSum = sum;

        //2. 슬라이딩 윈도우: i는 새로 들어오는 원소의 index
        for (int i = k; i < nums.length; i++) {
            //윈도우 한 칸 이동;
            // - 왼쪽에서 나가는 원소: nums[i - k]
            // - 오른쪽에서 새로 들어오는 원소 : nums[i]

            sum += nums[i] - nums[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }

        }

        //3. 최대 평균 = 최대 합 / k
        return (double) maxSum / k;

    }
}