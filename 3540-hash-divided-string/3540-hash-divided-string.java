class Solution {
    public String stringHash(String s, int k) {
        String result = "";

        int len = s.length();
        String[] splitted = new String[len / k];
        int index = 0;
        int counter = 0;

        String temp = "";
        for(int i = 1; i <= len; i++){
            temp += s.charAt(i - 1) + "";

            if(i % k == 0){
                splitted[index++] = temp;
                temp = ""; 
            }
        }

        for(String sp : splitted){
            char r;

            int sum = 0;
            for(char c : sp.toCharArray()){
                sum += c - 'a';
            }                

            r = (char)('a' + (sum % 26));
            result += "" + r;
        }

        return result;
    }
}