class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while(x != 0){
            nums.add(x % 10);
            x /= 10;
        }

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) != nums.get(nums.size() - i - 1)){
                return false;
            }
        }

        return true;
    }
}