package Day_9;

class Solution3 {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }
}

public class Leetcode_704 {
}
