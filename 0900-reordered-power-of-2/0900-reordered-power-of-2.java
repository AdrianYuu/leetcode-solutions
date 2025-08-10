class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] charN = String.valueOf(n).toCharArray();
        Arrays.sort(charN);
        String strN = new String(charN);

        for(int i = 0; i < 31; i++){
            int currPwr = (1 << i);

            char[] charCurrPwr = String.valueOf(currPwr).toCharArray();
            Arrays.sort(charCurrPwr);
            String strCurrPwr = new String(charCurrPwr);

            if(strN.equals(strCurrPwr)) return true;
        }

        return false;
    }
}