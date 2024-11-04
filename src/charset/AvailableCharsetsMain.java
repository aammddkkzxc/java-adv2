package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {

    public static void main(String[] args) {

        // os + 자바 이용 가능한 모든 charset
        SortedMap<String, Charset> charSets = Charset.availableCharsets();
        for (String charSetName : charSets.keySet()) {
            System.out.println(charSetName);
        }

        System.out.println();
        Charset charset1 = Charset.forName("ms949");
        System.out.println(charset1);

        // 별칭들
        Set<String> aliases = charset1.aliases();
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }


        // UTF-8 문자로 조회
        Charset charset2 = Charset.forName("UTF-8");
        System.out.println("charset2 = " + charset2);

        // UTF-8 상수도 있음
        Charset charset3 = StandardCharsets.UTF_8;
        System.out.println("charset3 = " + charset3);

        Charset charset4 = Charset.defaultCharset();
        System.out.println("default = " + charset4);

    }

}
