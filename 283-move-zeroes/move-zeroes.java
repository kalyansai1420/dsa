class Solution {
    public void moveZeroes(int[] nums) {
        int currPosition = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[currPosition] = nums[i];
                currPosition++;
            }
        }

        while(currPosition < nums.length){
            nums[currPosition] = 0;
            currPosition++;
        }
        
        
    }
}