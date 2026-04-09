class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String cleaned = s.trim().replaceAll("\\s+", " "); 
        String[] sArr = cleaned.split(" ");
        for(int i=sArr.length-1;i>=0;i--){
            if(i == 0){
                ans.append(sArr[i]);
            }else{
                
            ans.append(sArr[i]);
            ans.append(" ");
            }
        }

        return ans.toString();
    }
}