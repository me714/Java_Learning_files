package leetcode.q121;
//记录最低点，一次遍历
public class Solution2 {
    static int[]  x = new int[] {7,1,5,3,6,4};

    public static void main(String[] args) {
        System.out.println(maxProfit(x));
    }
    public static int maxProfit(int[] prices){
        int minprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprices){
                minprices = prices[i];
            }
            if (maxprofit < prices[i]- minprices){
                maxprofit = prices[i]- minprices;
            }

        }
        return maxprofit;
    }
}
