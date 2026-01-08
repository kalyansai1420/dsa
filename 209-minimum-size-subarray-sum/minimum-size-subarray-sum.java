class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int sum =0;
        while(r<nums.length){
            sum = sum+nums[r];
            while(sum >= target){
                minLen = Math.min(minLen,r-l+1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}