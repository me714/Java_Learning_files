package lesson1;

public class MyArrays {
    private int[] data;
    private int size;

    public MyArrays(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public MyArrays() {
        this(10);
    }
}
