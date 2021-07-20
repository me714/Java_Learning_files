package leetcode.q11;

public class Solution2 {
    public static void main(String[] args) {
        int[] a = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
    public static int maxArea(int[] height){
        int sq1 = 0;
        int sq2 = height.length-1;
        int m = 0;
        while (sq1 !=sq2){
            int c = (sq2-sq1)*Math.min(height[sq1],height[sq2]);
            if (c >= m){
                m = c;
            }
            if (height[sq1]>height[sq2]){
                sq2--;
            }else {
                sq1++;
            }
        }
        return m;
        }
    }
