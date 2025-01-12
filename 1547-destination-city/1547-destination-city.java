class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> destinations = new ArrayList<>();
        List<String> sources = new ArrayList<>();

        for(List<String> path : paths){
            sources.add(path.get(0));
            destinations.add(path.get(1));
        }

        for(String destination : destinations){
            boolean isValid = true;
            
            for(String source : sources){
                if(source.equals(destination)){
                    isValid = false;
                    break;
                }
            }

            if(isValid) return destination;
        }

        return "";
    }
}