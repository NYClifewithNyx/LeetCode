//LC1672_Richest Customer Wealth
//Date : 12/31/2025
//Level : Easy
//Approach: 2D array
//Note: int[] "customer" < variable named : array name (accounts에 있는 element 하나를 꺼내서 그걸 customer라고 부르겠다
//Runtime: 0 ms (beats 100.00%)

class Solution {
    public int maximumWealth(int[][] accounts) {
        //matrix problem = 2D array

        int maxWealthSoFar = 0;

        //enhanced for loop = 안에 있는 것을 하나씩 꺼내 쓰는 문법
        for (int[] customer : accounts) { //syntax = enhanced for loop. Read-only. It means I will name an element from accounts, I will call customer
            int currentCustomerWealth = 0;

            for (int bank : customer) {  //I will name bank from element from customer
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);

        }
        return maxWealthSoFar;

    }
}

//time complexity = O(n*m)
//space complexity = O(1) constant b/c we don't create data structure to find the solution