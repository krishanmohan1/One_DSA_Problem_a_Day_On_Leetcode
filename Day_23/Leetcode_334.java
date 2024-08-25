package Day_23;

public class Leetcode_334 {

    class Solution {
        public void reverseString(char[] s) {

            int i = 0;
            int j = s.length-1;

            while(i<j){
                char temp = s[i];
                s[i]=s[j];
                s[j]=temp;

                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {

    }
}
