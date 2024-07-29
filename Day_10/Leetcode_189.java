package Day_10;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int [] ans = new int[n];
        int j =0;
        for(int i = n-k;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i = 0; i < n-k;i++){
            ans[j++]=nums[i];
        }
        for(int i = 0; i < n; i++){

            nums[i]=ans[i];
        }
    }
}

public class Leetcode_189 {
    public static void main(String[] args) {

    }
}
