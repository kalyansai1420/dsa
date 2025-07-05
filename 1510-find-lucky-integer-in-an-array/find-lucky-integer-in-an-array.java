class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }else {
                hm.put(key,1);
            }
        }
        int maxLucky = -1;
        for(int k:hm.keySet()){
            if(hm.get(k) == k){
                maxLucky = k;
            }
        }
        return maxLucky;

    }
}