class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1Str = "", word2Str = "";

        for(String s : word1) word1Str += s;
        for(String s : word2) word2Str += s;

        return word1Str.equals(word2Str);
    }
}