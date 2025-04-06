class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for(int i=1;i<=n;i++){
            String binaryVal = Integer.toBinaryString(i);
            int count =0;
            for(char c:binaryVal.toCharArray()){
                if (c == '1') count++;
            }
            ans[i]=count;
        }

        return ans;
    }
}