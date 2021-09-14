package ChapterFour;

import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        loop();
    }
    public static int loop() {
        int numb = 1, num = 1;
        while (num <= 10) {
            numb = num * 2;
            System.out.println("2 x " + num + " = " + numb);
            num++;
        }
        return numb;
    }
}
