class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for(Character c : stones.toCharArray()){
            if(jewels.contains(String.valueOf(c))) result++;
        }
        
        return result;
    }
}