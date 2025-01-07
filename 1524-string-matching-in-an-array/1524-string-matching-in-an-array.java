class Solution {
    public List<String> stringMatching(String[] words) {

        HashSet<String> r = new HashSet<>();

        for(String word : words){
            for(String w : words){
                if(w.contains(word) && !w.equals(word)){
                    r.add(word);
                }
            }
        }

        List<String> result = new ArrayList<>(r);
        return result;
    }
}