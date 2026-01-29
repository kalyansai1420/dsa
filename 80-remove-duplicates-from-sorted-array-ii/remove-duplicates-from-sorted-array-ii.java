class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 2;
        while(j<nums.length){
            if(nums[i-1]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;

            
        }
        return i+1;
    }
}