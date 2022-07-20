// Find N Unique Integers Sum up to Zero

import java.util.Arrays;

class Solution {
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int a=-1, b=1, startPos=n%2==0?0:1;
        for (int i=startPos;i<arr.length;i++){
            arr[i] = i%2==0 ?a--:b++;
        }
        return arr;
    }
}
