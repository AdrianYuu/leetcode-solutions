class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int result = 0;
        int len = arr.length;

        Set<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int index = 0;
                int[] tempArr = new int[len + 1];

                tempArr[index++] = arr[i];
                tempArr[index++] = arr[j];

                boolean valid = true;

                while(valid){
                    valid = false;
                    tempArr[index] = tempArr[index - 2] + tempArr[index - 1];

                    if(set.contains(tempArr[index])){
                        valid = true;
                        index++;
                    }
                }
                
                if(index >= 3) result = Math.max(result, index);
            }
        }

        return result;
    }
}