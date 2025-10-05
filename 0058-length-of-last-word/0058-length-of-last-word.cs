public class Solution {
    public int LengthOfLastWord(string s) {
        int length = 0;
        int n = s.Length;

        int i = n - 1;
        while(i >= 0 &&  s[i] == ' '){
            i--;
        }
        while(i >= 0 && s[i] != ' '){
            length++;
            i--;
        }
        return length; 
    }
}