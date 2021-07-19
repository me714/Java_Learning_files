package binarysearchtree;

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
*/
        if (node == null){
            size ++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
            node.left = add(node.left, e);
        }else {
            node.right = add(node.right, e);
        }

        return node;
    }

}
