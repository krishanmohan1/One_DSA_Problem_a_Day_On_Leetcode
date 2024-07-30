package Day_8;
public class Leetcode_58 {
    public class Solution {
        public int lengthOfLastWord(String s){

            s = s.trim();

            if(s.isEmpty()) return 0;

            int lastSpaceIndex = s.lastIndexOf(" ");

            if(lastSpaceIndex == -1) return s.length();
            else return s.length() - lastSpaceIndex -1;


        }
    }


    public static void main(String[] args) {

    }
}
