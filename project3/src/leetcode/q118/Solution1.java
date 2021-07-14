package leetcode.q118;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> df = new ArrayList<>();
            if (list.size()==0){
                df.add(1);
            }else if (list.size()==1){
                df.add(1);
                df.add(1);
                }else {
                df.add(1);
                for (int j = 0; j < list.get(i-1).size()-1; j++) {
                    df.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
                }
                df.add(1);
            }
            list.add(df);
        }
        return list;
    }
}
