//Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}

