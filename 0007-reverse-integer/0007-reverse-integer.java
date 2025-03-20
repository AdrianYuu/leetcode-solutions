class Solution {
    public int reverse(int x) {
        boolean isMinus = x < 0;
        x = Math.abs(x);

        int result = 0;

        while(x > 0){
            int digit = x % 10;
            x /= 10;

            if(result > (Integer.MAX_VALUE - digit) / 10){
                return 0;
            }

            result = result * 10 + digit;
        }

        return isMinus ? -result : result;
    }
}