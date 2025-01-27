class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;

        while(len > 1){
            Arrays.sort(stones);
            stones[len - 2] = stones[len - 1] - stones[len - 2];
            len--;
        }
        
        return stones[0];
    }
}

/*
    2, 7, 4, 1, 8, 1
    1, 1, 2, 4, 7, 8
    1, 1, 1, 2, 4
*/