class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int num : nums) elementSum += num;
        for(int num : nums){
            String numString = String.valueOf(num);

            int tempSum = 0;
            for(char c : numString.toCharArray()){
                tempSum += (c - '0');
            }
            
            digitSum += tempSum;
        }

        return Math.abs(elementSum - digitSum);
    }
}