package leetcode.q330;

public class Solution2 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length;
        int index = 0;
        while (x <= n) {
            // �������ڵ�Ԫ���ڵ�ǰ���ܵĺ͵�������ʱ��nums[index] <= x��������ֱ�Ӹ��Ŀ��ܵĺ�����ķ�Χ�����ֵΪԭ���ĺͼ��ϵ�ǰԪ��
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                // �����õ�ǰ�����п��ܵĺ��޷�����ڵ�ǰ�͵����ֵ�뵱ǰ����Ԫ��ֵ֮�����
                // ������������в��뵱ǰ�ܲ��������к͵����ֵ(x)���������͵ķ�ΧΪԭ������������ʱ���ŵķ�Χ���
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
