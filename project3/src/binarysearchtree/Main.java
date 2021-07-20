package binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bts = new BinarySearchTree<>();
        int[] nums = {5,3,6,8,4,2};
        for (int num : nums) {
            bts.add(num);
        }

        bts.preOrder();
        System.out.println();
//        System.out.println(bts);
        bts.inOrder();
        System.out.println();

        bts.postOrder();
        System.out.println();
    }
}
