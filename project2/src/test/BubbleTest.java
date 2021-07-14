package test;

import algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {3,4,7,5,8,9,1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
