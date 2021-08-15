package Chapter5;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        int userInput = 10;
        Scanner input = new Scanner(System.in);

        int count = 1;
        if (userInput == 0) {
            System.out.println("incorrect input try again later");
            System.exit(0);
        }
        while (count <= userInput) {

            System.out.println("Enter number ");
            userInput = input.nextInt();

            userInput = userInput * count;
            System.out.println("Welcome to java");
            System.out.println(count++);
        }
    }
}
