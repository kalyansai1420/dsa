class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverse = new HashMap<>();
        String[] sList = s.split(" ");

        if (sList.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = sList[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            } else {
                map.put(c,word);
            }

            if(reverse.containsKey(word)){
                if(reverse.get(word) != c){
                    return false;
                }
            } else {
                reverse.put(word,c);
            }
        }
        return true;

    }
}