// Find Numbers with Even Number of Digits



class Solution {
    public int findNumbers(int[] nums) {
        int result=0;

        for (int i = 0; i < nums.length; i++) {
            int numOfDigits=0;

            for (int j = nums[i]; j > 0 ; j/=10) {
                numOfDigits++;
            }

            if(numOfDigits%2==0) {
                result++;
            }
        }
        return result;
    }
}