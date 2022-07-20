// Plus One


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]+1==10) {
            ArrayList<Integer> newDigits = new ArrayList<>();
            for (int i = 0; i < digits.length; i++) {
                newDigits.add(digits[i]);
            }
            int index= newDigits.size()-1,num=newDigits.get(index)+1;
            while(num>=10){
                newDigits.set(index,num%10);
                index--;
                if(index==-1) {
                    num=num/10;
                }
                else {
                    num=num/10+newDigits.get(index);
                }
            }

            if(index==-1) {
                newDigits.add(0,num);
            }
            else {
                newDigits.set(index,num);
            }

            int[] result = new int[newDigits.size()];
            for (int i = 0; i < newDigits.size(); i++) {
                result[i]= newDigits.get(i);
            }
            return result;
        }
        else {
            digits[digits.length-1]+=1;
            return digits;
        }
    }
}