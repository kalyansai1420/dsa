class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            hm.put(numbers[i],i);
        }
        int[] ans = new int[2];
        for(int i=0;i<numbers.length;i++){
            int complementary = target-numbers[i];
            if(hm.containsKey(complementary)){
                if(hm.get(complementary)!=i){
                    return new int[]{i+1,hm.get(complementary)+1};
                }

            }
        }
        return ans;
    }
}