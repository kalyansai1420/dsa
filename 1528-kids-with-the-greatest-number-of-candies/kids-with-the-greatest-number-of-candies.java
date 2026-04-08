class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<=candies[i]){
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(i,true);
            }else{
                ans.add(i,false);
            }
        }
        return ans;

    }
}