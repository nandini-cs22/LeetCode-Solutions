class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int current = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                current++;
            }else{
                prev = current;
                current = 0;
            }
            ans = Math.max(ans,prev+current);
        }
        return ans == nums.length ? ans-1:ans;
    }
}