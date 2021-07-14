package leetcode.q1;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        int[] a = new int[] {1,7,11,15,2};
        int b = 9;
        System.out.println(Arrays.toString(twoSum(a, b)));
    }
    public static int[] twoSum(int[] nums, int target){
        int[] c = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]!=nums[j]){
                    if(nums[i]+nums[j]==target){
                        c = new int[]{i, j};
                    }
                }
            }

        }

        return c;
    }
}
