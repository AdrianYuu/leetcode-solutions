class Solution {
    private String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
    public String finalString(String s) {
        String result = "";

        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'i'){
                result = reverseString(result);
            } else {
                result += s.charAt(i);
            }
        }

        return result;
    }
}