package test1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    static int[] s = {1,2,4,4,5,6};
    public static void main(String[] args) {

        System.out.println(containsDuplicate(s));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> se = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            se.add(nums[i]);
            if(se.size() < i+1){
                break;
            }

        }
        return se.size() < nums.length;
    }
}
