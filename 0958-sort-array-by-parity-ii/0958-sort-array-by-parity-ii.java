class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i] % 2 == 0){
                result[even] = nums[i];
                even += 2;
            }else{
                result[odd] = nums[i];
                    odd += 2;
            }
        }
        return result;
    }
}