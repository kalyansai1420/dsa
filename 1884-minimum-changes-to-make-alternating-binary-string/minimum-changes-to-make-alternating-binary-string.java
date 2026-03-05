class Solution {
    public int minOperations(String s) {
        int aLength = s.length();
        for(int i=0;i<s.length();i++){
            char expected = i%2 == 0 ? '0' :'1';
            if(s.charAt(i)!=expected){
                aLength--;
            }
        }
        int bLength = s.length()-aLength;
        return Math.min(aLength,bLength);
    }
}