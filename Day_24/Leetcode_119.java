package Day_24;
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int [][] matrix = new int[rowIndex+1][];
        List<Integer> a = new ArrayList<>();

        for(int i = 0 ; i <= rowIndex ; i++){
            matrix[i]=new int [i+1];
            matrix[i][0]=matrix[i][i]=1;

            for(int j  = 1 ; j < i;j++){
                matrix[i][j] = matrix[i-1][j]+ matrix[i-1][j-1];
            }
        }
        // a.add(matrix);

        for(int j = 0 ; j <= rowIndex; j++){
            a.add(matrix[rowIndex][j]);
        }
        return a;
    }
}

public class Leetcode_119 {
    public static void main(String[] args) {

    }
}
