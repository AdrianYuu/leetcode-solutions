class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        Arrays.sort(strs);

        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];

        for(int i = 0; i <  Math.min(firstWord.length(), lastWord.length()); i++){
            if(firstWord.charAt(i) != lastWord.charAt(i)) return ans;
            ans += firstWord.charAt(i);
        }

        return ans;
    }
}