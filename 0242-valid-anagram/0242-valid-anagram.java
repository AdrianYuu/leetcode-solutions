class Solution {
    public boolean isAnagram(String s, String t) {
        char[] occS = new char[26];
        char[] occT = new char[26];

        for(char c : s.toCharArray()) occS[c - 'a']++;
        for(char c : t.toCharArray()) occT[c - 'a']++;

        for(int i = 0; i < 26; i++) if(occS[i] != occT[i]) return false;
        return true;
    }
}