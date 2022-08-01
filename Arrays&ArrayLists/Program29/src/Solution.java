// Spiral Matrix

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int length=(matrix.length*matrix[0].length);                   //length of ArrayList ---> Result
        int rPos=matrix.length,cPos=matrix[0].length,rNeg=0,cNeg=-1;   //End points for Rotations
        int fixed = 0, moving = 0;                                     //indices for storing result values from matrix
        String rotation = "H+";
        /*
        Rotations(H+,V+,H-,V-):
            H+ --> Horizontal(moving: Left ---> Right )
            V+ --> Vertical (moving: Up ---> Down)
            H- --> Horizontal(moving: Right ---> Left)
            V- --> Vertical (moving: Down ---> Up)
        */

        while (length>0) {                               //Consider Example:
            if(rotation.equals("H+")) {                  //matrix->[[1,2,3,4],[5,6,7,8],[9,10,11,12]]
                result.add(matrix[fixed][moving]);       //here--> length=3x4=12
                moving++;                                //        rPos=3,cPos=4,rNeg=0,cNeg=-1(on Outer Spiral)

                if(moving==cPos) {                        //moving = cPos = 4
                    rotation = "V+";                      //rotation switched to V+
                    int temp=fixed;                       //temp storage for fixed(row)
                    fixed=moving-1;                       //fixed switched to last column(Index-->3)
                    moving=temp+1;                        //moving switched to row(current index+1-->0+1-->1)
                }
            }

            //result-->[1,2,3,4]

            else if(rotation.equals("V+")) {
                result.add(matrix[moving][fixed]);
                moving++;

                if(moving==rPos) {                        //moving = rpos = 3
                    rotation = "H-";                      //rotation switched to H-
                    int temp=fixed;
                    fixed = moving-1;                     //fixed switched to last row(Index-->2)
                    moving = temp-1;                      //moving switched to col(Current Index-1-->3-1-->2)
                }
            }

            //result-->[1,2,3,4,8,12]

            else if(rotation.equals("H-")) {
                result.add(matrix[fixed][moving]);
                moving--;

                if(moving==cNeg) {                         //moving = cNeg = -1
                    rotation="V-";                         //rotation switched to V-
                    int temp = fixed;
                    fixed = moving+1;                      //fixed switched to first column(Index-->0)
                    moving = temp-1;                       //moving switched to row(Current Index-1-->2-1-->1)
                }
            }

            //result-->[1,2,3,4,8,12,11,10,9]

            else {
                result.add(matrix[moving][fixed]);
                moving--;

                if(moving==rNeg) {                         //moving = rNeg = 0
                    rotation="H+";                         //rotation switched to H+
                    int temp = fixed;
                    fixed = moving+1;                      //fixed switched to second row(Index-->1)
                    moving = temp+1;                       //moving switched to column(Current Index+1-->0+1-->1)
                    rPos--;                                //EndPoint of V+ changed to (3-1)-->2
                    cPos--;                                //Endpoint of H+ changed to (4-1)-->3
                    rNeg++;                                //EndPoint of V- changed to (0+1)-->1
                    cNeg++;                                //EndPoint of H- changed to (-1+1)-->0
                }


                //result-->[1,2,3,4,8,12,11,10,9,5].....so on till end of spiral-->length

            }

            //Final_result-->[1,2,3,4,8,12,11,10,9,5,6,7]


            length--;
        }
        return result;
    }
}