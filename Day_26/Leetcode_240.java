package Day_26;

class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < matrix.length; i++){
            if(target <= matrix[i][n-1]){

                int left = 0;
                int right = matrix[i].length-1;

                while(left <= right ){
                    int mid = left + (right- left) / 2;
                    if(matrix[i][mid] == target){
                        return true;
                    }else if(matrix[i][mid] > target){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }

                }
            }
        }

        return false ;



    }
}
public class Leetcode_240 {
    public static void main(String[] args) {

    }
}
