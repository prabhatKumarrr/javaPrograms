// Determine Whether Matrix Can Be Obtained By Rotation



class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean result=false;
        int[][] rotate = new int[mat.length][mat.length];

        for (int i = 0; i < 4; i++) {

//          Rotate 90 Degree
            for (int j = 0; j < mat.length; j++) {
                for (int l=mat.length-1,k = 0; k < mat.length; k++,l--) {
                    rotate[j][k] = mat[l][j];
                }
            }
//          set mat = rotate for reuse
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat.length; k++) {
                    mat[j][k]=rotate[j][k];
                }
            }
//          Check whether both matrix same or not
            boolean check = true;
            outside:
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat.length; k++) {
                    System.out.print(target[j][k]+"->");
                    if(rotate[j][k]!=target[j][k]) {
                        check = false;
                        break outside;
                    }
                }
            }
            if(check) {
                result = true;
                break;
            }
        }
    return result;
    }
}