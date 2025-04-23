class NumArray {

    private int[] numArray;
    private int[] prefix;
    public NumArray(int[] nums) {
        this.numArray = nums;
        this.prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<numArray.length;i++){
            prefix[i] = prefix[i-1]+numArray[i];
        }
         
    }
    
    public int sumRange(int left, int right) {
        if(left ==0){
            return prefix[right];
        }
        
        int sum = prefix[right]-prefix[left-1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */