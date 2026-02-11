class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mArea = 0;
        while(left<right){
            int high = Math.min(height[left],height[right]);
            int width = right - left;
            int area = high * width;
            mArea = Math.max(area,mArea);
            if(height[left]>height[right]){
                right--;
            }else {
                left++;
            }
        }
        return mArea;
    }
}