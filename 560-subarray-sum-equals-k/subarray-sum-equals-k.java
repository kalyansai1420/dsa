class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // Base case: prefix sum = 0 occurs once

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // Check if there is a previous prefix sum that makes (sum - k)
            if (prefixCount.containsKey(sum - k)) {
                count += prefixCount.get(sum - k);
            }

            // Store current prefix sum in the map
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
        
    }
}