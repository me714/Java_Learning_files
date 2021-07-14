package leetcode.q73;

public class Solution1 {

    public void setZeroes(int[][] matrix){
        boolean a = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0]==0){
                a = true;
            }
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }

        }
        for (int j = matrix.length-1; j >= 0 ; j--) {
            for (int k = 1; k < matrix[0].length; k++) {
                if (matrix[j][0] == 0|| matrix[0][k]==0){
                    matrix[j][k] = 0;
                }

            }
            if (a){
                matrix[j][0] = 0;

            }
}}}
