//LC605 - Can Place Flowers
//Date : 12/7/2025
//Level : Easy
//Approach:
//Note:
//Runtime: 1 ms (beats 98.16%)


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        //arrayList로 하는 것은 불필요하고 속도만 느려짐.
        //array 하나를 한 번만 쭉 스캔하면 되는 문제.
        //현재 위치 i가 비어있으면 양 옆 (i + 1 / i - 0)이 비어있는지 여부 확인.
        //꽃을 심을 수 있으면 flowerbed[i] = 1로 바꾸기.

        //O(n) 솔루션 - 빠름

        int length = flowerbed.length; //flowerbed의 길이

        for (int i = 0;
        i < length;
        i++){
            if (flowerbed[i] == 0) {
                int left = (i == 0) ? 0 : flowerbed[i - 1];
                int right = (i == length - 1) ? 0 : flowerbed[i + 1];

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) return true;
                }

            }

        }
        return n <= 0;
    }
}