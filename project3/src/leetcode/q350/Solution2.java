package leetcode.q350;

import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    static int[] b = new int[] {1,2,3,4,5,6,6,6,6,6,6,5};
    static int[] c = new int[] {5,6,3,3};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(b,c)));
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i,0) + 1;
            map.put(i, count);
        }
        int dex = 0;
        int[] arr = new int[nums1.length];
        for (int j : nums2) {
            int count = map.getOrDefault(j,0);
            if (count > 0){
                arr[dex++] = j;
                count--;
                if(count>0){
                    map.put(j, count);
                }else {
                    map.remove(j);
                }
            }
        }
        return Arrays.copyOfRange(arr,0,dex);
    }

}
