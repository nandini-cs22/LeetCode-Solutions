class Solution {
    public boolean canArrange(int[] arr, int k) {
        int pairs[] = new int[k];
        for(int current : arr){
            int currentRem = ((current % k)+k)%k;
            pairs[currentRem] += 1;
        }
        for(int i = 0; i<=k/2;i++){
            if(i == 0){
                if(pairs[i] % 2 != 0)
                    return false;
            }
            else{
                int y = k-i;
                if(pairs[i] != pairs[y])
                    return false;
            }
        }
        return true;
    }
}