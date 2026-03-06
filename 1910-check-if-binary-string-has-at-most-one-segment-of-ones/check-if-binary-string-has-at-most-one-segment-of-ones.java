class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seen = false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == '1' && s.charAt(i) == '0'){
                seen = true;
            }
            if(seen && s.charAt(i) == '1'){
                return false;
            }
        }
        return true;
    }
}