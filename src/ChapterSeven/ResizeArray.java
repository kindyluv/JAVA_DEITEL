package ChapterSeven;

import java.util.Scanner;

public class ResizeArray {
    private static final Scanner scanner = new Scanner(System.in);
    private static String name = scanner.next();
    private static int user = scanner.nextInt();
    private static int[] input = new int[user];
    private static int userInput = scanner.nextInt();



    public static void getNumbers(){
        System.out.println("Enter number");
        //int[] numb = new int[input.length];
        for (int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }
    }

    public static void resizeArray(){
        int[] original = input;
        System.out.println("Enter user input");
        input = new int[userInput];
        for (int i = 0; i < original.length; i++){
            input[i] = original[i];
        }
    }

    public static void main(String[] args) {
        getNumbers();
        resizeArray();
    }
}
