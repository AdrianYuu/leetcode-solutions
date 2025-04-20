class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[2];

        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(nums1[i] == nums2[j]){
                    result[0]++;
                    break;
                }
            }
        }

        for(int i = 0; i < len2; i++){
            for(int j = 0; j < len1; j++){
                if(nums2[i] == nums1[j]){
                    result[1]++;
                    break;
                }
            }
        }

        return result;
    }
}