package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c.txt", true);
        for (int i = 1; i <10 ; i++) {
            fos.write("ฤ๚บร".getBytes(StandardCharsets.UTF_8));
            fos.write("\r\n".getBytes(StandardCharsets.UTF_8));

        }
        fos.write("ฤ๚บร".getBytes(StandardCharsets.UTF_8));
        fos.close();

    }
}
