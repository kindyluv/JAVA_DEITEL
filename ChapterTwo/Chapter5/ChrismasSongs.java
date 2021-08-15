package Chapter5;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class ChrismasSongs {


    public static void main(String[] args) {

       Scanner christmas = new Scanner(System.in);
       System.out.println("Enter day");
       int day = christmas.nextInt();
       String days = "";
       //int day;

       switch (day) {
           case 1 -> days = "first";

           case 2 -> days = "second";

           case 3 -> days = "third";

           case 4 -> days = "fourth";

           case 5 -> days = "fifth";

           case 6 -> days = "sixth";

           case 7 -> days = "seventh";

           case 8 -> days = "eighth";

           case 9 -> days = "ninth";

           case 10 -> days = "tenth";

           case 11 -> days = "eleventh";

           case 12 -> days = "twelfth";

       }
           System.out.println("On the " + days + " day of christmas, my true love sent to me");


       switch (day) {

           case 12:

               System.out.print("Twelve drummers drumming%n");

           case 11:

               System.out.print("Eleven pipers piping\n");
           case 10:

               System.out.print("Ten lords a-leaping\n");

           case 9:

               System.out.print("Nine ladies dancing\n");
           case 8:

               System.out.print("Eight maids a-milking\n");

           case 7:

               System.out.print("Seven swans a-swimming\n");
           case 6:

               System.out.print("Six geese a-laying\n");
           case 5:

               System.out.print("Five golden rings\n");

           case 4:

               System.out.print("Four calling birds\n");

           case 3:

               System.out.print("Three french hens\n");


           case 2:

               System.out.print("Two turtle doves, and\n");
           case 1:

               System.out.print("A partridge in a pear tree.\n");

               break;
       }

     //       int userInput = 10;
     //       Scanner input = new Scanner(System.in);

     //       int count = 1;
     //       if (userInput == 0){
     //           System.out.println("incorrect input try again later");
     //           System.exit(0);
     //       }
     //       while(count <= userInput){

     //           System.out.println("Enter number ");
     //           userInput = input.nextInt();

     //           userInput = userInput * count;
     //           System.out.println("Welcome to java");
     //           System.out.println(count++);
     //       }

    }

}



