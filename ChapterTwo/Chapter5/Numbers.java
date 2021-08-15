package ChapterFour;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = 1;
        // int number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;
        int count = 1;
        int number;
        int largestNumber1 = 0;
        int largestNumber2 = 0;

        while (count <= 10) {
            System.out.printf("Enter score %d%n", numbers++);
            number = input.nextInt();

                if (number > largestNumber1) {
                    largestNumber2 = largestNumber1;
                    largestNumber1 = number;

                } else if (number > largestNumber2)
                    largestNumber2 = number;

                count++;

            }

            System.out.printf("the largest number1 is %d%nthe largest number2 is %d%n", largestNumber1, largestNumber2);
          //  System.out.printf("the largest number2 is %d%n", largestNumber2);

        }

    }

