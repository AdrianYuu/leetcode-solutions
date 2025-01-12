class Solution {
    public boolean canBeValid(String s, String locked) {
        int len = s.length();

        if(len % 2 == 1) return false;

        int fixed = 0, open = 0, close = 0;

        for(int i = len - 1; i >= 0; i--){
            if(locked.charAt(i) == '0') fixed++;
            else if(s.charAt(i) == '(') open++;
            else if(s.charAt(i) == ')') close++;

            if(fixed - open + close < 0) return false;
        }

        fixed = 0;
        open = 0;
        close = 0;

        for(int i = 0; i < len; i++){
            if(locked.charAt(i) == '0') fixed++;
            else if(s.charAt(i) == '(') open++;
            else if(s.charAt(i) == ')') close++;

            if(fixed + open - close < 0) return false;
        }

        return true;
    }
}