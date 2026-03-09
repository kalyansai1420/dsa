class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='1'){
                result.append('0');
            } else{
                result.append('1');
            }
        }
        return result.toString();
    }
}