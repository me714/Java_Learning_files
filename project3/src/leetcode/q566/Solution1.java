package leetcode.q566;

import java.util.Arrays;

public class Solution1 {
    static int[][] a = {{1,2,3},{3,4,5}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(a, 3, 2)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        if (r*c==mat.length*mat[0].length){
            int[][] mr = new int[r][c];
            System.out.println("~~~~");
            int i =0;
            for (int[] m:mat) {
                for (int k : m) {

                    int a = i / c;
                    int b = i % c;
                    System.out.println(a);
                    System.out.println(b);
                    mr[a][b] = k;
                    i++;

                }

            }
        return mr;
        }else {
            return mat;
        }



    }
}
