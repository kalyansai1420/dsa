class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(int freq  : hm.values()){
            count = count+(freq*(freq-1)/2); 
        }
        return count;
    }

   
}