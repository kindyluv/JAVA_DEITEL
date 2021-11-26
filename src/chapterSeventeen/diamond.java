package chapterSeventeen;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = input; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= input - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = input; i > 0; i--){
            for (int j = 1; j <=input-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
