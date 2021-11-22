package Chapter5.Chapter5;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Remainder {

    public static void main(String[] args){

        int firstNum, secondNum, thirdNum, fourthNum, fifthNum, remainder;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int userInput = input.nextInt();

        while(!(userInput > 9999 && userInput <= 99999)){
            System.out.println("Enter number again");
            userInput = input.nextInt();
        }

        int number = userInput;

        fifthNum = number %10;
        number = number / 10;

        fourthNum = number % 10;
        number = number / 10;

        thirdNum = number % 10;
        number = number / 10;

        secondNum = number % 10;
        number = number / 10;

        firstNum = number;


        if(firstNum == fifthNum && secondNum == fourthNum){
            System.out.println("Number is palindrome");
        }else
        {
            System.out.println("Number is not palindrome");
        }
    }
}

