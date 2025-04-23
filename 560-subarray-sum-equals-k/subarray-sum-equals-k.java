class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum =0;
        int count = 0;
        for(int num:nums){
            sum = sum+num;

            if(hm.containsKey(sum-k)){
                count = count+hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return count;
        
    }
}