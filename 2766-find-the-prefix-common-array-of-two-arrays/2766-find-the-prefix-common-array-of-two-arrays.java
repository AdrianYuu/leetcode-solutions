class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] freq = new int[len + 1];
        int counter = 0;

        int[] result = new int[len];

        for(int i = 0; i < len; i++){
            if(++freq[A[i]] == 2) counter++;
            if(++freq[B[i]] == 2) counter++;

            result[i] = counter;
        }

        return result;
    }
}