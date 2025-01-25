class Solution {
    private String getBinaryString(int n, int b){
        String s = "";

        while(n > 0){
            s += String.valueOf(n % b);
            n /= b;
        }

        return s;
    }

    private boolean isPalindrome(String s){
        String sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }

    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++){
            String s = getBinaryString(n, i);
            if(!isPalindrome(s)) return false;
        }

        return true;
    }
}