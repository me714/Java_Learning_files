package leetcode.q42;

public class Solution1 {
    public int trap(int[] height) {
        int sum = 0;
        int max = getMax(height);
        for (int i = 1; i <= max; i++) {
            boolean isStart = false;
            int temp_sum = 0;
            for (int k : height) {
                if (isStart && k < i) {
                    temp_sum++;
                }
                if (k >= i) {
                    sum = sum + temp_sum;
                    temp_sum = 0;
                    isStart = true;
                }
            }
        }
        return sum;
    }
    private int getMax(int[] height) {
        int max = 0;
        for (int j : height) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
