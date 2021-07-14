package leetcode.q53;
//动态规划和贪心
public class Solution1 {
    public static void main(String[] args) {
        int[] a = {1,-1,2,4,-9,1,-3};
        System.out.println(maxSubarray(a));
    }
    public static int maxSubarray(int[] nums){
        int pre = 0, max = nums[0];
        for (int n : nums) {
            pre = Math.max(pre + n , n);
            max = Math.max(pre, max);
        }
        return max;
    }
}
