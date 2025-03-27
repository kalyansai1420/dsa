class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            count += hm.getOrDefault(num-k,0)+hm.getOrDefault(num+k,0);
        }
        return count;
    }
}