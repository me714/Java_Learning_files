package leetcode.q121;

//�����ƽ�
// �˳������ȱ�ݣ�ʱ�临�Ӷȹ���

public class Solution1 {
    static int[]  x = new int[] {7,1,5,3,6,4};

    public static void main(String[] args) {
        System.out.println(maxProfit(x));
    }
    public static int maxProfit(int[] prices){
        int a =0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[i]<prices[j]){
                    if (a<= prices[j]-prices[i]){
                        a = prices[j]-prices[i];
                    }

                }
            }
        }
        return a;
    }
}
