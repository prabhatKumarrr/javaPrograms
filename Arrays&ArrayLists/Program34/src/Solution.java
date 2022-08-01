// Find First and Last Position of Element in Sorted Array

import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int first=nums.length,last=0;
        boolean found = false;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                first=Math.min(first,i);
                last=Math.max(last,i);
                found=true;
            }
        }
        if(!found) {
            result[0]=-1;
            result[1]=-1;
        }
        else {
            result[0]=first;
            result[1]=last;
        }

        return result;
    }
}