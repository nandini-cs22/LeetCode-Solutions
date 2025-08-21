class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        for(int i = 0;i<n;i++){
            if(i==0){
                result[arr[i][1]] = "Gold Medal"; 
            }else if(i == 1){
                result[arr[i][1]] = "Silver Medal";
            }else if(i == 2){
                result[arr[i][1]] = "Bronze Medal";
            }else{
                result[arr[i][1]] = String.valueOf(i+1);
            }
        }
        return result;
    }
}