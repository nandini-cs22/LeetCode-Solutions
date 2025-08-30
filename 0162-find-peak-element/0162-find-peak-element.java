class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
}