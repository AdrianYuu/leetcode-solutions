class Solution {
    public int countDigits(int num) {
        int result = 0;

        String s = String.valueOf(num);
        for(char c : s.toCharArray()) if(num % (c - '0') == 0) result++;

        return result;
    }
}