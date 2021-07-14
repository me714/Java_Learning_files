package leetcode.q88;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] ints = {2,3,6,0,0,0,0,0,0,0,0};

        int[] ints1 = {1,2,3,4,5};
        merge(ints,3,ints1,5);
        System.out.println(Arrays.toString(ints));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] sort = new int[m + n];
        int zz1 = 0, zz2 = 0;
        int te;
        while (zz1 < m || zz2< n){
            if(zz1 == m){
                te = nums2[zz2++];
            }else if(zz2 == n){
                te = nums1[zz1++];
            }else if(nums1[zz1] < nums2[zz2]){
                te = nums1[zz1++];
            }else {
                te = nums2[zz2++];
            }
            sort[zz1+zz2-1] = te;
        }
        System.out.println(Arrays.toString(sort));
        System.arraycopy(sort, 0, nums1, 0, sort.length);
        }
    }

