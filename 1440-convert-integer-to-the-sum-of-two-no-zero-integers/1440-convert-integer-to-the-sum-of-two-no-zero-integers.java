class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1;i<n;i++){
            int result = n-i;
            if(isValid(i) && isValid(result)){
                return new int[]{i,result}; 
            }
        }
        return new int[]{};
    }
    private boolean isValid(int num){
        while(num > 0){
            if(num % 10 == 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}