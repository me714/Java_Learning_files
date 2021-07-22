package binarysearchtree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<E extends Comparable<E>>{
    private class Node{
        public E e;
        public Node left,right;
        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }
    private Node root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    public int getsize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void add(E e){
        if (root == null){
            root = new Node(e);
            size ++;
        }else {
            add(root, e);
        }
    }
    private Node add(Node node, E e){


/*
        if (e.equals(node.e)){
            return;
        }else if (e.compareTo(node.e) < 0 && node.left == null){
            node.left = new Node(e);
            size ++;
            return;
        }else if (e.compareTo(node.e)>0 && node.right == null){
            node.right = new Node(e);
            size++;
            return;
        }
        返回插入新节点后二分搜索树的根
*/
        if (node == null){
            size ++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            node.right = add(node.right, e);
        }

        return node;
    }
    public boolean contains(E e){
        return contains(root, e);

    }
    private boolean contains(Node node, E e){
        if (node == null){
            return false;
        }
        if (e.compareTo(node.e) == 0){
            return true;
        }else if (e.compareTo(node.e) < 0){
            return contains(node.left, e);
        }else {
            return contains(node.right, e);
        }
    }

//二分搜索树的前序DF遍历
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }
//二分搜索树的中序遍历（顺序输出）
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.right);
        System.out.println(node.e);
        inOrder(node.left);
    }
    //二分搜索树的后序遍历
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

//层序遍历
    public void levelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node cur = q.remove();
            System.out.println(cur.e);
            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }
    }

//    public E minimum(){
//        if (size == 0){
//            throw new IllegalArgumentException("二分搜索树是空的");
//        }
//        minimum(root);
//    }
//
//    private Node minimum(Node node){
//        if (node.left == null){
//
//        }
//    }

}
