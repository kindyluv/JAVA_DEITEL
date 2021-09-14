package ChapterFour;

import java.util.Scanner;

public class PrimeNumber {


        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter number ");

            int userInput = input.nextInt();

            boolean flag = false;

            int prime = 1;

            while(prime <= userInput) {

                if (userInput % prime == 0) {
                    flag = true;
                    break;
                }
                prime++;
            }

                if (flag = true) {
                    System.out.println("number is not a prime number");
                } else
                    if (flag = false){
                        System.out.println("number is prime number");
                    }
        }

}

