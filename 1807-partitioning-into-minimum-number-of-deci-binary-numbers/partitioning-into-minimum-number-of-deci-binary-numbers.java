class Solution {
    public int minPartitions(String n) {
        int minNum = Integer.MIN_VALUE;

        for(char c : n.toCharArray()){
            minNum = Math.max(minNum,c-'0');
        }
        return minNum;
    }
}