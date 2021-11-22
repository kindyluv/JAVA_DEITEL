package ChapterNine;

import java.util.Scanner;

public class NumberToString {
    private static Scanner scanner = new Scanner(System.in);
    private static int input = scanner.nextInt();

    public static void numberConverter(){
        String[] string = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
       int numb = 0;
        for (int i = 0; i < string.length; i++){
            numb = scanner.nextInt();
            System.out.println(string[numb]);
        }
    }

    public static void main(String[] args) {
        numberConverter();
    }
}
