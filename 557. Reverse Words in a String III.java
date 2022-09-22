class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String [] wordsStr=s.split(" ");
        for(String word:wordsStr){
            StringBuilder wordSb=new StringBuilder();
            wordSb.append(word);
            wordSb.reverse();
            result.append(wordSb.toString() +" ");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }
}
