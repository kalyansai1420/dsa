class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last,-1);
        int l = 0,maxLen=0;
        for(int r = 0;r< s.length();r++){
            char c = s.charAt(r);
            if(last[c]>=l){
                l = last[c]+1;

            }

            maxLen = Math.max(maxLen,r-l+1);
            last[c]= r;

        }
        return maxLen;
    }
}