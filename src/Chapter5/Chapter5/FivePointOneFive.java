package Chapter5;

import java.sql.SQLOutput;

public class FivePointOneFive {

    public static void main(String[] args) {

        for (int f = 10; f >= 0; f--) {
            for (int j = 10; j >= f; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= f; k++) {
                System.out.print("P");
            }
            System.out.println();
        }
            for (int i = 1; i <= 10; i++) {
                for (int j = 10; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("P");
                }
                System.out.println();
            }

            for (int a = 10; a > 0; a--) {
                for (int j = 1; j <= a; j++) {
                    System.out.print("A");
                }
                for (int k = 1; k <= a; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
                for (int e = 1; e <= 10; e++) {
                    for (int j = 1; j <= e; j++) {
                        System.out.print("");
                    }
                    for (int k = 10; k >= e; k--) {
                        System.out.print("M");
                    }
                    System.out.println();
                }
    }
}



