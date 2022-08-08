// Kth Missing Positive Number


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=1;
        int i=0;
        while(k!=0) {
            if(k!=0 && i==arr.length){
                k--;
                if(k==0){
                    return missing;
                }
                missing++;

            }
            else if(missing!=arr[i]) {
                k--;
                if(k==0){
                    return missing;
                }
                missing++;
            }
            else {
                i++;
                missing++;
            }
        }
        return -1;
    }
}