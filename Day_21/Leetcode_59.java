package Day_21;

public class Leetcode_59 {

    class Solution {
        public int[][] generateMatrix(int n) {

            int[][] matrix = new int[n][n];
            int curr = 1;
            int topRow = 0, bottomRow = n - 1, rightCol = n - 1, leftCol = 0;

            while (topRow <= bottomRow && leftCol <= rightCol) {

                // topRow -> letfCol to rightCol
                for(int j = leftCol ; j <= rightCol && curr <= n*n ; j++){
                    matrix[topRow][j] = curr++;
                }
                topRow++;

                //rightCol -> topRow to bottomRow

                for(int i = topRow ; i <= bottomRow && curr <= n*n ; i++){
                    matrix[i][rightCol]=curr++;
                }
                rightCol--;

                //bottomRow -> rightCol to leftCol

                for(int j = rightCol ; j >= leftCol && curr <= n*n; j--){
                    matrix[bottomRow][j]=curr++;
                }
                bottomRow--;

                //firstCol -> bottomRow to topRow
                for(int i = bottomRow ; i >= topRow && curr <= n*n;i--){
                    matrix[i][leftCol]=curr++;
                }
                leftCol++;

            }
            return matrix;
        }
    }
    public static void main(String[] args) {

    }
}
