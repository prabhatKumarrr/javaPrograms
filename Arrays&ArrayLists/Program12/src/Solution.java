//Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int overallAlt=0, highestAlt =0;
        for (int i = 0; i < gain.length; i++) {
            overallAlt+=gain[i];
            if(overallAlt > highestAlt) {
                highestAlt = overallAlt;
            }
        }
        return highestAlt;
    }
}