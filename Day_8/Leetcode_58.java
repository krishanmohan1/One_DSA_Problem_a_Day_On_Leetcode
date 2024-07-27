package Day_8;
public class Leetcode_58 {
    public class Solution {
        public int lengthOfLastWord(String s){
            s = s.trim();
            String[] words = s.split(" ");
            String lastWord = words[words.length - 1];
            return lastWord.length();
        }
    }


    public static void main(String[] args) {

    }
}
