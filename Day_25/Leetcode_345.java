package Day_25;

class Solution {

    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {

        char [] a = s.toCharArray();

        int left = 0 ;
        int right = s.length()-1;

        while(left < right ){

            while(left < right && !isVowel(a[left])){
                left++;
            }

            while(left < right && !isVowel(a[right])){
                right--;
            }

            char temp = a[left];
            a[left]=a[right];
            a[right]=temp;

            left++;
            right--;
        }

        return new String(a);

    }

}

public class Leetcode_345 {
    public static void main(String[] args) {

    }
}
