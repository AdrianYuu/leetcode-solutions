class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;

        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(heights[j] < heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    String temp2 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp2;
                }
            }
        }

        return names;
    }
}