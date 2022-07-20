// Lucky Numbers in a Matrix

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                boolean checkRow=true;
                boolean checkCol=true;
                for(int k=0;k<matrix[i].length;k++) {
                    if(matrix[i][j]>matrix[i][k]) {
                        checkRow=false;
                        break;
                    }
                }
                if(checkRow) {
                    for(int k=0;k<matrix.length;k++) {
                        if(matrix[i][j]<matrix[k][j]) {
                            checkCol=false;
                            break;
                        }
                    }
                }
                if(checkRow && checkCol) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}