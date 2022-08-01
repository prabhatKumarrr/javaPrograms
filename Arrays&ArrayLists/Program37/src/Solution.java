//  Sort Colors

import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int[] sort = new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            int small=nums[i];
            int index=i;
            for(int j=0;j<nums.length;j++) {
                if(nums[j]==3) {
                    continue;
                }
                if(nums[j]<small) {
                    small=nums[j];
                    index=j;
                }
            }
            sort[i]=small;
            nums[index]=3;
        }

        for(int i=0;i<nums.length;i++) {
            nums[i]=sort[i];
        }
    }
}