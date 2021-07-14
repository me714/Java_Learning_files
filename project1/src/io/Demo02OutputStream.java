package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(12);
        fos.write(14);
        fos.write(16);
        byte[] bytes = {45,46,47,48,49};
        fos.write(bytes,1,2);
        byte[] b = "ฤ๚บร".getBytes(StandardCharsets.UTF_8);
        fos.write(b);
        fos.close();
    }
}
