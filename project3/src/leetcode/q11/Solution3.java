package leetcode.q11;

public class Solution3 {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int head = 0;
        int tail = height.length - 1;

        // ѭ��ֱ��ͷ��β�����򽻲�
        while (head < tail) {
            int volume;

            // ���㵱ǰ�����Լ��ƶ�ͷ��β��С��ֵ
            // �ƶ���С��ָ������Ϊ������ƶ���С��һ�ˣ����ݻ���Զ�������ӣ����Խ�С��һ����Զ�����Ϊ�߽�
            // ���൱������ȥ���˲����ܵĽ�Ӷ���С����ԭ������Ĵ�С
            if (height[head] >= height[tail]) {
                volume = height[tail] *  (tail - head);
                tail--;
            } else {
                volume = height[head] * (tail - head);
                head++;
            }

            // �����������
            if (volume > maxVolume) {
                maxVolume = volume;
            }
        }
        return maxVolume;
    }
}
