// Reshape the Matrix



class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];

        if(mat.length*mat[0].length!=r*c) {
            return mat;
        }
        else {
            int row=0,col=0;

            for(int i=0;i<mat.length;i++) {
                for(int j=0;j<mat[i].length;j++) {
                    if(col==c) {
                        row++;
                        col=0;
                    }
                    result[row][col] = mat[i][j];
                    col++;
                }
            }
        }
        return result;
    }
}