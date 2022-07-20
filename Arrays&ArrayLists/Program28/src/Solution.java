// Minimum Cost to Move Chips to The Same Position




class Solution {
    public int minCostToMoveChips(int[] position) {
//         cost needed to move all coins to an odd position
        int costOdd = 0;
//         cost needed to move all coins to an even position
        int costEven = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                costOdd++;
            } else {
                costEven++;
            }
        }

        return Math.min(costOdd, costEven);
    }
}