class Solution {
    public int bitwiseComplement(int n) {
        String nDecimal = Integer.toBinaryString(n);
        StringBuilder res = new StringBuilder();
        for(char ch:nDecimal.toCharArray()){
            if(ch == '1'){
                res.append('0');
            } else {
                res.append('1');
            }
        }
        int ans = Integer.parseInt(res.toString(),2);
        return ans;        
    }
}