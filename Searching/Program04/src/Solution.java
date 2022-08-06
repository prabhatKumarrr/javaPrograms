//Two Sum II - Input Array Is Sorted



class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        out:
        for(int i=0;i<numbers.length;i++) {
            int start = i+1;
            int end = numbers.length-1;
            while(start<=end) {
                int mid = start+(end-start)/2;

                if(numbers[i]+numbers[mid]==target) {
                    result[0] = i+1;
                    result[1] = mid+1;
                    break out;
                }
                else if(numbers[i]+numbers[mid]>target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return result;
    }
}