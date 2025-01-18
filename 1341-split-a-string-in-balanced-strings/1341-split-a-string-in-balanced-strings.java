class Solution {
    public int balancedStringSplit(String s) {
        int len = s.length();
        int result = 0;
        int balance = 0;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'L') balance++;
            else balance--;

            if(balance == 0) result++;
        }

        return result;
    }
}