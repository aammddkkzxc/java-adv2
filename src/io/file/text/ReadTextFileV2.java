package io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadTextFileV2 {

    public static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("===writeString===");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        Files.writeString(path, writeString, UTF_8);

        System.out.println("===readString===");
        List<String> lines = Files.readAllLines(path, UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }

        System.out.println("===readStringLine===");
        Stream<String> lineStream = Files.lines(path, UTF_8);
        lineStream.forEach(line -> System.out.println(line));
        lineStream.close();

        System.out.println("===readStringLineTryResourceClean===");
        try(Stream<String> lineStream2 = Files.lines(path, UTF_8)){
            lineStream2.forEach(System.out::println);
        }
    }

}
