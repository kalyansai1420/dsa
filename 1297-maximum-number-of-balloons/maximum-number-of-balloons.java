class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int count =Integer.MAX_VALUE;
        HashMap<Character,Integer> ballonHM = new HashMap<>();
        ballonHM.put('b',1);
        ballonHM.put('a',1);
        ballonHM.put('l',2);
        ballonHM.put('o',2);
        ballonHM.put('n',1);
        for(char key : ballonHM.keySet()){
            int available = hm.getOrDefault(key,0);
            int needed = ballonHM.get(key);
            count = Math.min(count,available/needed);
        }

        return count;


    }
}