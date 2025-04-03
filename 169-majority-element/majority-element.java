class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int k : hm.keySet()){
            if ( hm.get(k) > nums.length/2){
                return k;
            }
        }
        return 0;
        
    }
}