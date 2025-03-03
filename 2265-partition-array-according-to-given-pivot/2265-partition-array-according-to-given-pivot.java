class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lt = new ArrayList<>();
        List<Integer> eq = new ArrayList<>();
        List<Integer> gt = new ArrayList<>();

        for(int num : nums){
            if(num < pivot) lt.add(num);
            else if(num == pivot) eq.add(num);
            else gt.add(num);
        }

        int len = nums.length;
        int[] result = new int[len];
        int index = 0;

        for(int num : lt) result[index++] = num;
        for(int num : eq) result[index++] = num;
        for(int num : gt) result[index++] = num;

        return result;
    }
}