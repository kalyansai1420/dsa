class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> stMap = new HashMap<>();
        Map<Character, Character> tsMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(stMap.containsKey(sChar)){
                if(stMap.get(sChar)!=tChar){
                    return false;
                }
            }

            if(tsMap.containsKey(tChar)){
                if(tsMap.get(tChar)!=sChar){
                    return false;
                }
            }
            stMap.put(sChar,tChar);
            tsMap.put(tChar,sChar);
        }
        return true;



    }
}