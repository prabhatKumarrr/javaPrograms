// First Missing Positive

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int result=1;
        Arrays.sort(nums);


        for(int i=0;i<nums.length;i++) {
            if(result==nums[i]) {
                result++;
            }
        }
        return result;
    }
}