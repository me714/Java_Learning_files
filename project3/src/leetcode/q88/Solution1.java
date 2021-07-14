package leetcode.q88;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] ints = new int[12];
        for (int i = 0; i < 4; i++) {
            ints[i] = i;
        }
        int[] ints1 = {1,2,3,4,5};
        merge(ints,6,ints1,5);
        System.out.println(Arrays.toString(ints));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < nums2.length ; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
                }
            }



