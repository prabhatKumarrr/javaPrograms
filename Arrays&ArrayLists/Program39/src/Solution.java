// Max Value of Equation

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;                                // Max  --> holding min integer value that is valid for comparison purpose
        //      --> will be used to store the final result

        int eq = 0;                                                 // eq   --> variable used to hold various equation evaluations at an index(0<->position.length-1)
        int flag = 1;                                               // flag --> variable holding index of next X(j) to compare next with X(i)
        for(int i = 0;i<points.length-1;i++)
        {
            if(flag<i+1)
                flag = i+1;
            for(int j = flag;j<points.length;j++)
            {
                if(Math.abs(points[i][0]-points[j][0])>k)
                    break;                                          // x is in ascending order with each index value even if we move onto next values
                // the difference will   always be greater than k.

                eq = points[i][1]+points[j][1]+Math.abs(points[i][0]-points[j][0]);
                if(max<eq)
                {
                    max = eq;
                    flag = j-1;                                     // switching to previous element than the matching one to be compared again
                }
            }
        }
        return max;
    }
}