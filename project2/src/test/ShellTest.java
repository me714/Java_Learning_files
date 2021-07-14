package test;

import algorithm.sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {2,4,5,1,5,2,6,3,7,0,3,5,6,7,4,2,76,6,8,2,9,1};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
