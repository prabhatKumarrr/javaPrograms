// Maximum SubArray



class Solution {
    public static int maxSubArray(int[] nums) {
        int result=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int newSum= Math.max(sum+nums[i],nums[i]);
            sum = newSum;
            if(newSum>result)
                result = newSum;
        }

        return result;
    }
}
