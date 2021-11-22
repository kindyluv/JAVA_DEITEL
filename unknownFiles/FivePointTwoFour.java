package Chapter5.unknownFiles;

import java.util.Scanner;

  public class FivePointTwoFour {

    public static void main(String[] args) {

           for (int f = 10; f >= 0; f--) {
               for (int j = 10; j >= f; j--) {
                   System.out.print(" ");
               }
               for (int k = 1; k <= f; k++) {
                   System.out.print("P");
               }
               for (int j = 1; j <= f; j++) {
                   System.out.print("A");
               }
               System.out.println();
           }

         for (int i = 1; i <= 10; i++) {
             for (int j = 10; j >= i; j--) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i; k++) {
                 System.out.print("* ");
             }
             System.out.println();
         }

         for (int e = 1; e <= 10; e++) {
             for (int j = 1; j <= e; j++) {
                 System.out.print(" ");
             }
             for (int k = 10; k >= e; k--) {
                 System.out.print("* ");
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
                System.out.print("G");
            }
            for (int l = 1; l <= e; l++) {
                System.out.print("H");
            }
            for (int k = 10; k >= e; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int f = 1; f <= 10; f++) {
            for (int j = 1; j <= f; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= f; k++) {
                System.out.print("P");
            }
            for (int j = 10; j >= f; j--) {
                System.out.print("A");
            }
            System.out.println();
        }


        //import java.util.Scanner;

        //public class FivePointOneSix{
        //public static void main(String[]args){

             int userInput = 1;


           while(userInput <=5){

               Scanner input = new Scanner(System.in);

               System.out.println("Enter number" + userInput++);

               userInput = input.nextInt();



               userInput++;

            if(userInput > 30)
            break;

           }
           System.out.println("*");
  }

}