package Day_19;

class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] ans = new int[col][row];
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;



    }
}

public class Leetcode_867 {
    public static void main(String[] args) {

    }
}
