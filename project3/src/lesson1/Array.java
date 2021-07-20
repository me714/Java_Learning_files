package lesson1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int index = 0;
        while (index < arr.length){
            System.out.println(arr[index]);
            index ++;
        }
    }
}
