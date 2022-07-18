//Shuffle the Array

public class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];

        for (int j = 0, i = 0; i < n; i++, j += 2) {
            output[j] = nums[i];
            output[j + 1] = nums[n + i];
        }
        return output;
    }
}