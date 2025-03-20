class Solution {
    public char repeatedCharacter(String s) {
        int[] counter = new int[26];
        
        for(char c : s.toCharArray()){
            counter[c - 'a']++;
            if(counter[c - 'a'] == 2) return c;
        }

        return 'a';
    }
}