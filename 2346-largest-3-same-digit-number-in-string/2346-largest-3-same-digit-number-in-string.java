class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        int temp = -1;
        int ctr = 0;

        for(int i = 1; i < len; i++){
            if(num.charAt(i) == num.charAt(i - 1)){
                ctr++;
                if(ctr == 2){
                    ctr = 0;
                    temp = Math.max(((int)num.charAt(i) - '0'), temp);
                }
            } else {
                ctr = 0;
            }
        }

        if(temp == -1) return "";
        return temp + "" + temp + "" + temp;
    }
}