package ChapterFour;

import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args){
            int remainder;
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter numbers");
            int number = userInput.nextInt();
           while(number <=99999 && number >= 10000){
           remainder = number % 10;
           number = number / 10;

           if (number <= 99999){
               System.out.println("palindrome is positive");
           }
               if (number >= 10000) {
                   System.out.println("palindrome is positive");
               } else
           {
               System.out.println("palindrome is negative");
           }
           }

        }
}
