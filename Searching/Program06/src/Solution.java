// Arranging Coins(Easy)

class Solution {
    public int arrangeCoins(int n) {
        int result = 0,i=1;

        while(n>0) {
            n-=i;
            if(n>=0){
                result++;
            }
            i++;
        }

        return result;
    }
}