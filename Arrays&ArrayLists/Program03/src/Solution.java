//Running Sum of 1d Array

 class Solution {
     public int[] runningSum(int[] nums) {
         int[] returnSum = new int[nums.length];
         int sum = 0;
         for (int i = 0; i < nums.length; i++) {
             sum+=nums[i];
             returnSum[i] = sum;
         }
         return returnSum;
     }
 }
