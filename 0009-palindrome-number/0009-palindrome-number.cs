public class Solution {
    public bool IsPalindrome(int x) {
        long result = 0L;
        int n = x;
        while(n > 0){
            int reverse = n % 10;
            result = (result * 10) + reverse;
            n = n / 10;
        }
        return result == x;
    }
}