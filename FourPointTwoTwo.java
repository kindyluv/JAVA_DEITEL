package Chapter5;

import java.util.Scanner;

public class FourPointTwoTwo {

    public static void main(String[] args) {


    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int count = 1;
    System.out.printf("%s%s%s%s%n", "N    ", " 10*N    ", " 100*N   ", " 1000*N    ");
    while (count <= 5) {
        number1 = 10 * count;
        number2 = 100 * count;
        number3 = 1000 * count;

        System.out.printf("%2d%7d%9d%10d%n", count, number1, number2, number3);
        count++;
    }
    Scanner input = new Scanner(System.in);
      System.out.println("Enter number");
      int userInput = input.nextInt();
    while(userInput >= 0){
         System.out.println(userInput);
         userInput--;

    }


        System.out.println("Enter number");
        int userInputs = input.nextInt();

    int counts = 1;
    while(counts <= userInputs){

        System.out.println(counts);
        counts++;
    }
       int counter = 1;
       while (counter <= userInputs){
           if(counter % 2 == 0){
               System.out.println(counter);
           }
           counter++;
       }
         int counters = 1;
        while (counters <= userInputs){
            if (counters % 2 != 0){
                System.out.println(counters);
            }
            counters++;
        }

        for (int inputs = 0; inputs <= userInputs; inputs++){
            if (inputs % 2 != 0){
                System.out.println(count);
            }
        }
    }
}