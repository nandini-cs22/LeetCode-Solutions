public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int n = nums.Length;
        int[] result = new int[2];

        Dictionary<int,int> map = new Dictionary<int,int>();
        for(int i = 0;i < n;i++){
            int complement = target - nums[i];
            if(map.ContainsKey(complement)){
                result[0] = map[complement];
                result[1] = i;
                return result;
            }
            if(!map.ContainsKey(nums[i])){
                map[nums[i]] = i;
            }
        }
        return result;
    }
}