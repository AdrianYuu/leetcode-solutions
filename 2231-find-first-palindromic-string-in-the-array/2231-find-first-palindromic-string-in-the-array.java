class Solution {
    
    private boolean isPalindrome(String s){
        String sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }

    public String firstPalindrome(String[] words) {
        for(String s : words) if(isPalindrome(s)) return s;
        return "";
    }
}