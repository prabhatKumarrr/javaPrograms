//Cells with Odd Values in a Matrix



class Solution {
    public static int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] matrix = new int[m][n];

        for (int i = 0;i<indices.length;i++){
            for (int j = 0; j < indices[i].length; j++) {
                if (j == 0) {
                    for (int k = 0; k < n; k++) {
                    matrix[indices[i][j]][k]++;
                    }
                }
                else {
                    for (int k = 0; k < m; k++) {
                        matrix[k][indices[i][j]]++;
                    }
                }
            }
        }

        for(int i = 0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                   result++;
                }
            }
        }
        return result;
    }
}