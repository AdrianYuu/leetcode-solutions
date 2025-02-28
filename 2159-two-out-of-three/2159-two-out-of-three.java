class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();

        int[] ctr1 = new int[101];
        int[] ctr2 = new int[101];
        int[] ctr3 = new int[101];

        for(int num : nums1) ctr1[num] = 1;
        for(int num : nums2) ctr2[num] = 1;
        for(int num : nums3) ctr3[num] = 1;

        for(int i = 1; i < 101; i++){
            if(ctr1[i] + ctr2[i] + ctr3[i] > 1) result.add(i);
        }

        return result;
    }
}