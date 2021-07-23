package leetcode.q230;

import set.LinkedListToSet;

import java.util.LinkedList;

public class Solution1 {
    public int kthSmallest(TreeNode root, int k){
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (true){
            while (root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0){
                return root.val;
            }
            root = root.right;
        }

    }
}
