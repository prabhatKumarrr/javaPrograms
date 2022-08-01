// Product of Array Except Self

import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int prod=1;
        int prodZero=1;
        int flag=0;

        for(int i=0;i<nums.length;i++) {      //for calculating product of non zero elements
            if(nums[i]==0) {                  //calculate no of zeroes in array
                flag++;
                continue;
            }
            prodZero*=nums[i];
        }

        if(flag>=2) {                        //if more than one zero found then product at all indices will be zero
            return result;
        }

        for(int i=0;i<nums.length;i++) {     // calculate product of all elements
            prod*=nums[i];
        }

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                result[i]=prodZero;          //product at element =0
                continue;
            }

            result[i]=prod/nums[i];          //product excluding itself
        }
        return result;
    }
}

