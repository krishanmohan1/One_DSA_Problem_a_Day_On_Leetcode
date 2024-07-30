package Day_10;

            // Rotate anray by k step

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

class EfficientSolution{
    public void reverse(int arr[] ,int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public void rotate(int arr[], int k ){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }


}

public class Leetcode_189 {
    public static void main(String[] args) {

    }
}
