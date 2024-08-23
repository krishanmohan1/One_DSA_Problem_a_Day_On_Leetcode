package Day_20;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int toprow = 0, rightcol = matrix[0].length - 1, bottomrow = matrix.length - 1, leftcol = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int totalElement = 0;

        while (totalElement < m * n) {

            // toprow -> leftcol to rightcol
            for (int j = leftcol; j <= rightcol && totalElement < m * n; j++) {
                result.add(matrix[toprow][j]);
                totalElement++;
            }
            toprow++;

            // rightcol = toprow to bottomrow

            for(int i = toprow; i <= bottomrow && totalElement < m *n ;i++){
                result.add(matrix[i][rightcol]);
                totalElement++;
            }
            rightcol--;

            // bottomrow -> rightcol to firstcol

            for(int j = rightcol;j>=leftcol && totalElement < m *n ;j--){
                result.add(matrix[bottomrow][j]);
                totalElement++;
            }
            bottomrow--;

            for(int i = bottomrow;i>=toprow && totalElement < m *n ;i--){
                result.add(matrix[i][leftcol]);
                totalElement++;
            }
            leftcol++;


        }

        return result;


    }
}


public class Leetcode_54 {
    public static void main(String[] args) {

    }
}
