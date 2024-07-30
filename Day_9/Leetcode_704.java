package Day_9;

class Solution3 {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]){
                j=mid-1;
            }else{
                i=-mid+1;
            }
        }
        return -1;

    }
}

public class Leetcode_704 {
    public static void main(String[] args) {
        Solution3 obj = new Solution3();

        int arr [] = {4,5,8,6,9,8};
        int target = 6;
        int res = obj.search(arr,target);
        System.out.println(res);
    }
}
