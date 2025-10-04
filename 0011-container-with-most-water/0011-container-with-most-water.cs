public class Solution {
    public int MaxArea(int[] height) {
        int maxArea = int.MinValue;
        int left = 0;
        int right = height.Length - 1;
        while(left < right){
            int width = right - left;
            int currentHeight = Math.Min(height[left] , height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.Max(maxArea , currentArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}