//Matrix Diagonal Sum


class Solution {
    public int diagonalSum(int[][] mat) {
        int result=0;

        if(mat.length%2!=0) {
            for (int i = 0; i < mat.length; i++) {
                result+=mat[i][i];
            }

            for (int i = 0,j=mat.length-1; i < mat.length; i++,j--) {
                if(i==j)
                    continue;
                else {
                   result+=mat[i][j];
                }
            }
        }
        else {
            for (int i = 0; i < mat.length; i++) {
                result+=mat[i][i];
            }

            for (int i = 0,j=mat.length-1; i < mat.length; i++,j--) {
                result+=mat[i][j];
            }
        }
        return result;
    }
}