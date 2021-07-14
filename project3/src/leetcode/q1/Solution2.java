package leetcode.q1;

import java.util.Arrays;
import java.util.HashMap;


public class Solution2 {
    public static void main(String[] args) {
        int[] a = new int[] {1,7,11,15,2};
        int b = 9;
        System.out.println(Arrays.toString(twoSum(a, b)));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerIntegerHashMap.containsKey(target-nums[i])){
                return new int[] {integerIntegerHashMap.get(target-nums[i]),i};
            }
            integerIntegerHashMap.put(nums[i],i);

        }
        return new int[0];
    }
}
