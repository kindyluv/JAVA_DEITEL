package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .sum()
        );

        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .map((int x) -> {return x * 2; })
                        .sum()

        );

        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .filter(x -> x % 2 ==0)
                        .map(x -> x * 3)
                        .sum()
        );

       }
}
