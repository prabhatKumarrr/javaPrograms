// Add to Array-Form of Integer

import java.util.List;
import java.util.ArrayList;

class Solution {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k != 0) {
            if(i>=0) {
                k += num[i];
            }
            result.add(0,k % 10);
            k /= 10;
            i--;
        }
        return result;
    }
}