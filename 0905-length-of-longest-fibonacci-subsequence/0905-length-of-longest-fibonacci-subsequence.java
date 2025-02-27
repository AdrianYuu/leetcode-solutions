class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int result = 0;
        int len = arr.length;

        Set<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int counter = 2;
                int firstNumber = arr[i];
                int secondNumber = arr[j];

                boolean valid = true;

                while(valid){
                    valid = false;
                    int temp = firstNumber;
                    firstNumber = secondNumber;
                    secondNumber += temp;

                    if(set.contains(secondNumber)){
                        valid = true;
                        counter++;
                    }
                }
                
                if(counter >= 3) result = Math.max(result, counter);
            }
        }

        return result;
    }
}