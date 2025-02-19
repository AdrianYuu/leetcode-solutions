class Solution {
    private int getIndex(String ruleKey){
        if(ruleKey.equals("type")) return 0;
        else if(ruleKey.equals("color")) return 1;
        return 2;
    }
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = getIndex(ruleKey);
        int result = 0;

        for(List<String> l : items){
            if(l.get(index).equals(ruleValue)) result++;
        }

        return result;
    }
}