class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean result = true;
        while(result){
            result = false;
            for(int num : nums){
                if(num == original){
                    original = original * 2;
                    result = true;
                    break;
                }
            }
        }
        return original;
    }
}