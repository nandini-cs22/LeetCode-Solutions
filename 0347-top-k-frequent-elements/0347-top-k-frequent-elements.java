class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] result = new int[k];
        for(int i = 0;i<k;i++){
            int maxFreq = -1;
            int maxKey = 0;

            for(int key : map.keySet()){
                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }
            result[i] = maxKey;
            map.remove(maxKey);
        }
        return result;
    }
}