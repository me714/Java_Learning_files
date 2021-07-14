package io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c.txt");
//        int len = fis.read();
//        System.out.println(len);
        int len =0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        
        fis.close();

    }
}
