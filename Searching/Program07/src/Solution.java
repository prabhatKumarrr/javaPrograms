// Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int charVal = (int)target;
        int start = 0;
        int end = letters.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;

            if((int)letters[mid]>charVal) {
                if(mid==0 || (int)letters[mid-1]<=charVal) {
                    return letters[mid];
                }
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return letters[0];
    }
}