class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(left<right){
            int width = right-left;
            int h = Math.min(height[left],height[right]);
            int area = width*h;
            ans = Math.max(area,ans);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
        
    }
}