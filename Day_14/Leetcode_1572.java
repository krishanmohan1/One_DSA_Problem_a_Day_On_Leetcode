package Day_14;

class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int total_sum = 0;

        for(int i = 0; i < n ; i ++){
            total_sum = total_sum + mat[i][i];

            if(i != n-1-i){
                total_sum = total_sum + mat[i][n-1-i];
            }
        }

        return total_sum;

    }
}

public class Leetcode_1572 {
    public static void main(String[] args) {

    }
}
