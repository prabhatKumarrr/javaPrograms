// Jump Game

class Solution {
    public boolean canJump(int[] nums) {

        boolean result = true;
        if(nums.length<=1) {
            return true;
        }
        else if(nums[0]==0 && nums.length>1) {
            return false;
        }
        int current=nums[0],next=0;
        int len=nums.length-1;
        for(int i=1;i<nums.length;i++) {
            next=Math.max(current-1,nums[i]);
            current=next;
            if(current==0 && i!=nums.length-1) {
                result=false;
                break;
            }
        }
        return result;
    }
}