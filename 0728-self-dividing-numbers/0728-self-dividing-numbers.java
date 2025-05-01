class Solution {
    private boolean isSelfDividingNumber(int num){
        int temp = num;

        while(num != 0){
            int digit = num % 10;
            if(digit == 0 || temp % digit != 0) return false;
            num /= 10; 
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i = left; i <= right; i++) if(isSelfDividingNumber(i)) result.add(i);

        return result;
    }
}