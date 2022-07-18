
public class SolutionArraysOnly {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(result[index[i]]==-1) {
                result[index[i]] = nums[i];
            }
            else {
                for (int j = nums.length-1; j > index[i] ; j--) {
                    result[j]=result[j-1];
                }
                result[index[i]]=nums[i];
            }
        }
        return result;
    }
}
