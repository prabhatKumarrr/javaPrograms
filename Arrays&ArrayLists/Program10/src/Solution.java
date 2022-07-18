//Check if the Sentence Is Pangram


 class Solution {
     public boolean checkIfPangram(String sentence) {
         boolean check = true;

         for (int i = 97; i <= 122; i++) {
             boolean found = false;
             for (int j = 0; j < sentence.length(); j++) {
                 if(sentence.charAt(j)==(char)i) {
                     found = true;
                     break;
                 }
             }
             if(!found) {
                 check = false;
                 break;
             }
         }
         return check;
     }
 }
