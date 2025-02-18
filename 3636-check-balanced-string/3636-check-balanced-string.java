class Solution {
    public boolean isBalanced(String num) {
        int sumEven = 0, sumOdd = 0;
        int len = num.length();

        for(int i = 0; i < len; i++){
            if(i % 2 == 0) sumEven += (num.charAt(i) - '0');
            else sumOdd += (num.charAt(i) - '0');
        }

        return sumEven == sumOdd;
    }
}