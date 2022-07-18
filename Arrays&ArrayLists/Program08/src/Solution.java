//How Many Numbers Are Smaller Than the Current Number

class Solution {
 public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] result = new int[nums.length];
      for (int i = 0; i < nums.length ; i++) {
            int check=0;
            for (int j = 0; j < nums.length; j++) {
                if(j!=i) {
                    if(nums[j]<nums[i]) {
                        check++;
                    }
                }
            }
            result[i]=check;
      }
      return result;
 }
}