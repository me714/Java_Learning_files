package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c.txt");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
    }
}
