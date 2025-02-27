class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>(); 
        
        for(int i : candyType) set.add(i);

        int size = set.size();
        int len = candyType.length / 2;

        return Math.min(size, len);        
    }
}