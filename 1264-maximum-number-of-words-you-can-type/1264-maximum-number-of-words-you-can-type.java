class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");

        for(String word : words){
            boolean result = true;

            for(int i = 0;i < word.length();i++){
                if(brokenLetters.indexOf(word.charAt(i)) != -1){
                    result = false;
                    break;
                }
            }
            if(result){
                count++;
            }
        }    
        return count; 
    }
}