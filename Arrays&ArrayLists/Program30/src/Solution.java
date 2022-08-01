//Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int length=n*n,rPos=n,cPos=n,rNeg=0,cNeg=-1;
        int fixed = 0, moving = 0;
        String rotation = "H+";
        for (int i=1;i<=length;i++) {
            if(rotation.equals("H+")) {
                matrix[fixed][moving]=i;
                moving++;

                if(moving==cPos) {
                    rotation = "V+";
                    int temp=fixed;
                    fixed=moving-1;
                    moving=temp+1;
                }
            }
            else if(rotation.equals("V+")) {
                matrix[moving][fixed]=i;
                moving++;

                if(moving==rPos) {
                    rotation = "H-";
                    int temp=fixed;
                    fixed = moving-1;
                    moving = temp-1;
                }
            }
            else if(rotation.equals("H-")) {
                matrix[fixed][moving]=i;
                moving--;

                if(moving==cNeg) {
                    rotation="V-";
                    int temp = fixed;
                    fixed = moving+1;
                    moving = temp-1;
                }
            }
            else {
                matrix[moving][fixed]=i;
                moving--;

                if(moving==rNeg) {
                    rotation="H+";
                    int temp = fixed;
                    fixed = moving+1;
                    moving = temp+1;
                    rPos--;
                    cPos--;
                    rNeg++;
                    cNeg++;
                }
            }
        }
        return matrix;
    }
}