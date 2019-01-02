package io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayInputStream byteArrayInputStream;
            FileInputStream fileInputStream = new FileInputStream("test.in");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
