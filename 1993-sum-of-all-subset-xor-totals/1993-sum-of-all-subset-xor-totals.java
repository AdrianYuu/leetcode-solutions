class Solution {
    private void generateSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets){
        if(index == nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        generateSubsets(nums, index + 1, subset, subsets);

        subset.remove(subset.size() - 1);
        generateSubsets(nums, index + 1, subset, subsets);
    }

    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        generateSubsets(nums, 0, new ArrayList<>(), subsets);

        int result = 0;
        for(List<Integer> subset : subsets){
            int total = 0;

            for(int num : subset){
                total ^= num;
            }

            result += total;
        }

        return result;
    }
    
}