class Solution {
    public boolean isSubsequence(String s, String t) {
        int top = 0;
        int bottom = 0;
 
        while(top<s.length() && bottom<t.length()){
            if(s.charAt(top)==t.charAt(bottom)){
                top++;
               

            }
                bottom++;
            
        }
        return top == s.length();
    }
}