class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int len = sb.length();

        for(int i = 0; i < len; i++){
            if(sb.charAt(i) == '6'){
                sb.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}