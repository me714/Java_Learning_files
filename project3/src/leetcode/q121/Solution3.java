package leetcode.q121;
//¶¯Ì¬¹æ»®
public class Solution3 {
    static int[]  x = new int[] {7,1,5,3,6,4};

    public static void main(String[] args) {
        System.out.println(maxProfit(x));
    }
    public static int maxProfit(int[] prices){
        int pre = 0,res = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            pre = Math.max(pre+diff, 0);
            res = Math.max(res,pre);
        }
        return res;
    }

}
