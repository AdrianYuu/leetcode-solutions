class Solution {
    private String getBitInt(int num){
        StringBuilder sb = new StringBuilder();

        while(num != 0){
            sb.append(String.valueOf(num % 2));
            num /= 2;
        }

        return sb.reverse().toString();
    }
    
    public int hammingDistance(int x, int y) {
        String strX = getBitInt(x);
        String strY = getBitInt(y);
        int strXlen = strX.length();
        int strYlen = strY.length();
        int len = Math.max(strXlen, strYlen);

        StringBuilder sb;

        if(strYlen > strXlen){
            sb = new StringBuilder(strX);
            sb = sb.reverse();
            int diff = strYlen - strXlen;
            for(int i = 0; i < diff; i++){
                sb.append(0);
            }
            sb = sb.reverse();
            strX = sb.toString();
        } else {
            sb = new StringBuilder(strY);
            sb = sb.reverse();
            int diff = strXlen - strYlen;
            for(int i = 0; i < diff; i++){
                sb.append(0);
            }
            sb = sb.reverse();
            strY = sb.toString();
        }

        System.out.println(strX);
        System.out.println(strY);

        int result = 0;
        for(int i = 0; i < len; i++){
            System.out.println(strX.charAt(i));
            System.out.println(strY.charAt(i));

            if(strX.charAt(i) != strY.charAt(i)){
                result++;
            }
        }

        return result;
    }
}