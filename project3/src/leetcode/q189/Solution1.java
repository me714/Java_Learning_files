package leetcode.q189;

import lesson1.Array;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        int k = 4;
        rotate(a,k);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate(int[] nums, int k){
        int[] d = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int b = nums.length -k;
            while (b<0){
                b = b +nums.length;
            }
            d[i] = nums[(i+b)%nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = d[i];

        }
    }
}
