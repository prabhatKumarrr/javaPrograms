// Remove Duplicates from the Sorted Array


class Solution {
    public static int removeDuplicates(int[] nums) {
        int k=nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j] && nums[i]!=-1) {
                    k--;
                    for (int l = j; l < nums.length-1; l++) {
                        nums[l]=nums[l+1];
                    }
                    nums[nums.length-1]=-1;
                    j--;
                }
            }
        }
        return k;
    }
}