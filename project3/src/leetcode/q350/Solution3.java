package leetcode.q350;

import java.util.Arrays;

public class Solution3 {
    static int[] b = new int[] {1,2};
    static int[] c = new int[] {1,1};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(b,c)));
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        if (nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sq1 = 0, sq2 = 0,dex = 0;
        int[] arr =new int[nums1.length];
        while (sq1 < nums1.length && sq2 < nums2.length){
            if (nums1[sq1]==nums2[sq2]){
                arr[dex++] = nums1[sq1];
                sq1++;
                sq2++;
            }else if(nums1[sq1]> nums2[sq2]){
                sq2++;
            }else {
                sq1++;
            }
        }

        return Arrays.copyOfRange(arr,0, dex);
    }
}
