class Solution {
    private String reverseStr(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseWords(String s) {
        String[] splitted = s.split(" ");

        String result = "";
        int idx = 0;
        int len = splitted.length;

        for(String str : splitted){
            result += reverseStr(str);
            if(idx++ != len - 1) result += " ";
        }

        return result;
    }
}