class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum =0;
        int count =0;
        hm.put(0,1);
        for(int num:nums){
            sum +=num;
            int mod = (sum %k+k)%k;
            if(hm.containsKey(mod)){
                count = count+ hm.getOrDefault(mod,0);
            }
            hm.put(mod,hm.getOrDefault(mod,0)+1);
        }
        return count;
        
    }
}