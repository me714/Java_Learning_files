package leetcode.q11;

public class Solution3 {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int head = 0;
        int tail = height.length - 1;

        // 循环直到头和尾相遇或交叉
        while (head < tail) {
            int volume;

            // 计算当前容量以及移动头和尾较小的值
            // 移动较小的指针是因为如果不移动较小的一端，则容积永远不会增加，所以较小的一端永远不会成为边界
            // 这相当于我们去除了不可能的解从而减小了问原本问题的大小
            if (height[head] >= height[tail]) {
                volume = height[tail] *  (tail - head);
                tail--;
            } else {
                volume = height[head] * (tail - head);
                head++;
            }

            // 更新最大容量
            if (volume > maxVolume) {
                maxVolume = volume;
            }
        }
        return maxVolume;
    }
}
