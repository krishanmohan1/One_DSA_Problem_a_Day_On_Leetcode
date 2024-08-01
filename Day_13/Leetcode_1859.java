package Day_13;

class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] originalSentence = new String[words.length];

        for(String word : words)
        {
            int position = word.charAt(word.length() - 1) - '0';
            String actualWord = word.substring(0,word.length() - 1);
            originalSentence[position - 1] = actualWord;
        }

        return String.join(" ",originalSentence);
    }
}

public class Leetcode_1859 {
    public static void main(String[] args) {

    }
}
