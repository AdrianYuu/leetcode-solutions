class Solution {
    public int findClosest(int x, int y, int z) {
        int xDiff = Math.abs(x - z);
        int yDiff = Math.abs(y - z);

        if(xDiff == yDiff) return 0;
        if(xDiff < yDiff) return 1;
        return 2;
    }
}