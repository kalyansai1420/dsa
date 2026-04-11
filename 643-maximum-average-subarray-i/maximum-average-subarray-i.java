class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=l-k;i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum = sum +nums[j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return (double)maxSum/k;
    }
}