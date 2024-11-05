package io.start;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {

    public static void main(String[] args) throws IOException {

        PrintStream ps = System.out;

        byte[] bytes = "Hello!\n".getBytes();
        ps.write(bytes);
        ps.println("Print!");

    }

}
