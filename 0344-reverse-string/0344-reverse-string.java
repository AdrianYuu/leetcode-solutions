class Solution {
    public void reverseString(char[] s) {
        int len = s.length;

        for(int i = 0, j = len - 1; i < len / 2; i++, j--){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
}