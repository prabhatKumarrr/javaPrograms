// Set Matrix Zero

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> indices = new ArrayList<>();
        int t=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j]==0) {
                    indices.add(new ArrayList<>());
                    indices.get(t).add(i);
                    indices.get(t++).add(j);
                }
            }
        }

        for(int i=0;i<indices.size();i++) {
            int x=indices.get(i).get(0);
            int y=indices.get(i).get(1);

            for(int j=0;j<matrix[0].length;j++) {
                matrix[x][j]=0;
            }
            for(int j=0;j<matrix.length;j++) {
                matrix[j][y]=0;
            }
        }
    }
}