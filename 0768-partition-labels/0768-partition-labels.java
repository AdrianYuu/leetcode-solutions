class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurence = new int[26];
        int len = s.length();

        for(int i = 0; i < len; i++){
            lastOccurence[s.charAt(i) - 'a'] = i;
        }

        int size = 1, partitionEnd = 0;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < len; i++){
            partitionEnd = Math.max(partitionEnd, lastOccurence[s.charAt(i) - 'a']);

            if(i == partitionEnd){
                result.add(size);
                partitionEnd = 0;
                size = 1;
                continue;
            }
            
            size++;
        }

        return result;
    }
}