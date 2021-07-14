package test;

import algorithm.sort.Insert;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        Integer[] a = {3,4,7,5,8,9,1};
        Insert.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
