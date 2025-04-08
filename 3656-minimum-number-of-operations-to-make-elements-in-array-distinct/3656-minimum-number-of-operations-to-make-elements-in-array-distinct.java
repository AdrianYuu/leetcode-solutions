class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        int loop = (len / 3) + 1;
        int index = 0;
        int result = 0;
        int expectedLength = len;

        for(int i = 0; i < loop; i++){
            Set<Integer> hashSet = new HashSet<>();

            for(int j = index; j < len; j++) hashSet.add(nums[j]);

            if(hashSet.size() == expectedLength) return result;
            if(index + 3 > len) return result + 1;

            result++;
            index += 3;
            expectedLength -= 3;
        }

        return result;
    }
}