package test;

import algorithm.sort.Selection;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {1,5,2,6,3,7,0,2,5,6};
        Selection.sort(arr);
        System.out.println(arr);
    }
}
