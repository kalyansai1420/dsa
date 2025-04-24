class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0,-1);
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i] = -1;
        }
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(hm.containsKey(sum)){
                maxLength = Math.max(maxLength,i-hm.get(sum));
            } else {
                hm.put(sum,i);
            }
        }
        return maxLength;
    }
}