package chapterSeventeen;

import java.util.Scanner;

public class XmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = input; i >0; i--) {
            for (int j =1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= input-i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        int num = 2;
        for (int i = 1; i <=4; i++) {
            for (int j = input/2; j >0 ; j--) {
                System.out.print("  ");
            }
            for (int j = num; j > 0; j--) {
                System.out.print(" *");
            }
            for (int j = input/2; j >0 ; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
