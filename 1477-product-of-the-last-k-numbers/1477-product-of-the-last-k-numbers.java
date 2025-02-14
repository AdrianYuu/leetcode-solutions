class ProductOfNumbers {
    List<Integer> numList;

    public ProductOfNumbers() {
        this.numList = new ArrayList<>();
    }
    
    public void add(int num) {
        this.numList.add(num);
    }
    
    public int getProduct(int k) {
        int size = this.numList.size();
        int ctr = 0;
        int result = 1;

        for(int i = size - 1; i >= 0; i--){
            if(ctr == k) break;
            result *= this.numList.get(i);
            ctr++;
        }

        return result;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */