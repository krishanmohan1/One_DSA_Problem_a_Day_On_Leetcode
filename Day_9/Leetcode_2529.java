package Day_9;

class Solution2{
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg = 0;
        for(int i = 0;  i < nums.length;i++){
            if(nums[i]>0)
                pos++;
            if(nums[i]<0)
                neg++;


        }
        return Math.max(pos,neg);

    }
}

public class Leetcode_2529 {
}
