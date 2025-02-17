class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        int len = s.length();

        for(int i = 0; i < len; i++){
            char currentChar = sb.charAt(i);

            if(currentChar >= 'A' && currentChar <= 'Z'){
                sb.setCharAt(i, (char)(currentChar + ('a' - 'A')));
            }
        }

        return sb.toString();
    }
}