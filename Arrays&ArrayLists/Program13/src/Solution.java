//Flipping an Image

import java.util.Arrays;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0,k= image[i].length-1; j < image[i].length; j++,k--) {
                result[i][j] = Math.abs(1-image[i][k]);
            }
        }

        return result;
    }
}