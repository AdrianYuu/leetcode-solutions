class Solution {
    public List<List<Integer>> generate(int numRows) {
        int totalElement = 1;
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> old = null;

        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < totalElement; j++){
                if(j == 0){
                    temp.add(0, 1);
                    continue;
                } 

                if(j == totalElement - 1){
                    temp.add(totalElement - 1, 1);
                    continue;
                }
                
                temp.add(j, old.get(j - 1) + old.get(j));
            }

            result.add(temp);
            old = new ArrayList<>(temp);
            totalElement++;
        }

        return result;
    }
}