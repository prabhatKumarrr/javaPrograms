// Maximum Population Year


import java.util.ArrayList;

class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxCount=0,year=logs[0][0];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                int count = 0;
                for (int k = 0; k < logs.length; k++) {
                    for (int l = logs[k][0]; l < logs[k][1]; l++) {
                        if (j == l) {
                            count++;
                        }
                    }
                }
                if (count >= maxCount) {
                    if(count==maxCount) {
                        if(year > j) {
                            year=j;
                        }
                    }
                    else {
                        year=j;
                    }
                    maxCount=count;
                }
            }
        }
        return year;
    }
}