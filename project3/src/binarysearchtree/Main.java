package binarysearchtree;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bts = new BinarySearchTree<>();
//        int[] nums = {5,3,6,8,4,2};
//        for (int num : nums) {
//            bts.add(num);
//        }
//
//        bts.preOrder();
//        System.out.println();
////        System.out.println(bts);
//        bts.inOrder();
//        System.out.println();
//
//        bts.postOrder();
//        System.out.println();
//        bts.levelOrder();
//        System.out.println();

        Random random = new Random();
        int n = 1000;
        for (int i = 0; i < n; i++) {
            bts.add(random.nextInt(10000));

        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bts.isEmpty()){
            nums.add(bts.removeMin());
        }
        System.out.println(nums);




    }
}
