class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i=0;
        int n = nums.length;
        while(i<n){
            int j = nums[i]-1;
            if(nums[i]!=nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
            } else {
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                result.add(i+1);
            }
        }
        return result;
    }
}