class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        HashSet<Integer> result = new HashSet<>();

        HashMap<Integer, Boolean> hmap = new HashMap<>();

        for(int i = 0; i < len1; i++){
            hmap.put(nums1[i], true);
        }

        for(int i = 0; i < len2; i++){
            if(hmap.containsKey(nums2[i])) result.add(nums2[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}