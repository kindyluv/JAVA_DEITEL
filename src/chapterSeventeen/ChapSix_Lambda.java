package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class ChapSix_Lambda {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        //Chapter six
        System.out.println("Random numbers on separate lines: ");

        random.ints(10, 1, 7)
                .forEach(System.out::println);

        //display 10 rand ints on same line
        String numbers = random.ints(10, 1, 7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.printf("%nRandom numbers on line: %s%n", numbers);

    }

}
