package Day_17;

class Solution2 {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }

}

public class Leetcode_125 {
    public static void main(String[] args) {

    }
}
