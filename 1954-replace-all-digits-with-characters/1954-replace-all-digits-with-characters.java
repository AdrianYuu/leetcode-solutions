class Solution {
    public String replaceDigits(String s) {
        int len = s.length();

        char[] arr = s.toCharArray();

        for(int i = 0; i < len; i++){
            if(arr[i] >= '0' && arr[i] <= '9'){
                arr[i] = (char)(arr[i - 1] + (arr[i] - '0'));
            }
        }

        return new String(arr);
    }
}