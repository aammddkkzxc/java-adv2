package io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class RealTextFileV1 {

    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {

        String writeString = "abc\n가나다";
        System.out.println("===writeString===");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        Files.writeString(path, writeString, StandardCharsets.UTF_8);
        String readString = Files.readString(path, StandardCharsets.UTF_8);

        System.out.println("===readString===");
        System.out.println(readString);

    }

}