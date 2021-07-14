package leetcode.q350;

import java.util.Arrays;
import java.util.HashMap;
//此方法存在Bug，当短的为外层循环时，重复的也会包括在交集里面
public class Solution1 {
    static int[] b = new int[] {1,2,3,4,5,6,6,6,6,6,6,5};
    static int[] c = new int[] {5,6,3,3};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(b,c)));
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        int[] str = new int[Math.min(nums1.length,nums2.length)];
        int i = 0;
        for (int j : nums2) {
            for (int k : nums1) {
                if (j == k) {
                    str[i++] = j;
                    break;
                }
            }
        }

        return Arrays.copyOfRange(str,0,i);
    }

}
