package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("project1\\a.txt");
        fos.write(97);
        fos.close();

    }
}
