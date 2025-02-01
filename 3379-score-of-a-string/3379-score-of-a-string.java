class Solution {
    public int scoreOfString(String s) {
        int result = 0;

        int len = s.length();

        for(int i = 0; i < len - 1; i++){
            result += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return result;
    }
}