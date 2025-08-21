class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        if(set.size() < 3){
            return set.last();
        }
        return set.lower(set.lower(set.last()));
    }
}