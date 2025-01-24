class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int len = mountain.length;
        List<Integer> result = new ArrayList<>();

        if(len <= 2) return result;

        for(int i = 1; i < len - 1; i++){
            if(mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]){
                result.add(i);
            }
        }

        return result;
    }
}