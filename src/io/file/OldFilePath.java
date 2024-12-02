package io.file;

import java.io.File;
import java.io.IOException;

public class OldFilePath {

    public static void main(String[] args) throws IOException {

        File file = new File("temp/..");

        //상대
        System.out.println("path : " + file.getPath());

        //절대
        System.out.println("absolutePath : " + file.getAbsolutePath());

        //정규
        System.out.println("canonicalPath : " + file.getCanonicalPath());

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.isFile() ? "F" : "D" +  " : " + f.getName());
        }
    }

}
