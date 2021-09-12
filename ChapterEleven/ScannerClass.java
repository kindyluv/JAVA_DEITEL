package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    private int firstNumber = input("Enter Number");
    private String firstName = name("Enter name");


    public static int input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
    try {
        return scanner.nextInt();
    }catch (InputMismatchException presh){
        System.out.println("Mumu ass");
    }
    return input(prompt);
    }

    public static String name(String prompts){
     Scanner scanner = new Scanner(System.in);
        System.out.println(prompts);
    try {
        return scanner.next();
    }catch (InputMismatchException presh){
        System.out.println("incorrect entry please enter a valid number");
    }
    return name(prompts);
    }
}
