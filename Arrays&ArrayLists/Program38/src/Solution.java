// House Robber

class Solution {
    public static int rob(int[] nums) {
        int max=0, prevMax=0;                              //I am storing:
                                                           // Maximum loot till (i)   -> Max
        for(int i=0;i<nums.length;i++) {                   // Maximum loot till (i-1) -> prevMax
            int current = Math.max(nums[i]+prevMax,max);
                int temp=max;                              // For better understanding of the concept used here
                max=current;                               // try mapping the values on a notebook at every index.
                prevMax=temp;
        }
        return max;
    }
}