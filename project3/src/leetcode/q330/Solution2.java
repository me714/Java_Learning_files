package leetcode.q330;

public class Solution2 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length;
        int index = 0;
        while (x <= n) {
            // 当数组内的元素在当前可能的和的区间内时（nums[index] <= x），可以直接更改可能的和区间的范围的最大值为原来的和加上当前元素
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                // 否则用当前的所有可能的和无法获得在当前和的最大值与当前数组元素值之间的数
                // 必须得向数组中插入当前能产生的所有和的最大值(x)来扩大最大和的范围为原来的两倍（此时扩张的范围最大）
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
