class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();

        int word1Idx = 0, word2Idx = 0;

        Boolean isWord1 = true;
        Boolean still = true;

        String result = "";

        while(word1Len > 0 || word2Len > 0){
            still = word1Len > 0 && word2Len > 0;

            if(still){
                if(isWord1){
                    result += word1.charAt(word1Idx++);
                    isWord1 = false;
                    word1Len--;
                    continue;
                } else {
                    result += word2.charAt(word2Idx++);
                    isWord1 = true;
                    word2Len--;
                    continue;
                }
            }

            if(word1Len > 0){
                result += word1.charAt(word1Idx++);
                word1Len--;
            } else {
                result += word2.charAt(word2Idx++);
                word2Len--;
            } 
        }

        return result;
    }
}