package Day_26;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length-1;
        // int m = matrix[0].length;

        for(int i  = 0 ; i < matrix.length; i++){

            if(target >= matrix[i][0] && target <= matrix[i][m] ){
                int left = 0, right = m;

                while(left <= right){
                    int mid = left + (right - left ) / 2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(matrix[i][mid] > target){
                        right = mid - 1;

                    }else{
                        left = mid + 1;
                    }
                }
            }
        }

        return false;

    }
}

public class Leetcode_74 {
    public static void main(String[] args) {

    }
}
