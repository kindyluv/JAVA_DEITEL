import java.util.Scanner;

public class TwoPointThreeTwo{
public static void main(String[] args){ 

Scanner userInput = new Scanner(System.in);

int number1, number2, number3, number4, number5;

int positiveNumber = 0, negativeNumber = 0, zero = 0;

System.out.printf("Enter the firstNumber:%n");
number1 = userInput.nextInt();

System.out.printf("Enter the secondNumber:%n");
number2 = userInput.nextInt();

System.out.printf("Enter the thirdNumber:%n");
number3 = userInput.nextInt();

System.out.printf("Enter the fouthNumber:%n");
number4 = userInput.nextInt();

System.out.printf("Enter the fifthNumber:%n");
number5 = userInput.nextInt();

if (number1 == zero) 
   zero = zero + 1;

if (number2 == zero) 
   zero = zero + 1;

if (number3 == zero) 
   zero = zero + 1;

if (number4 == zero) 
   zero = zero + 1;

if (number5 == zero) 
  zero = zero + 1;

if (number1 < negativeNumber) 
   negativeNumber = negativeNumber + 1;

if (number2 < negativeNumber) 
   negativeNumber = negativeNumber + 1;

if (number3 < negativeNumber) 
   negativeNumber = negativeNumber + 1;

if (number4 < negativeNumber) 
   negativeNumber = negativeNumber + 1;

if (number5 < negativeNumber) 
   negativeNumber = negativeNumber + 1;

if (number1 >= positiveNumber) 
   positiveNumber = positiveNumber + 1;

if (number2 >= positiveNumber) 
   positiveNumber = positiveNumber + 1;

if (number3 >= positiveNumber) 
   positiveNumber = positiveNumber + 1;

if (number4 >= positiveNumber) 
   positiveNumber = positiveNumber + 1;

if (number5 >= positiveNumber) 
   positiveNumber = positiveNumber + 1;


System.out.printf("The negativeNumber is:%d%n", negativeNumber);

System.out.printf("The positiveNumber is:%d%n", positiveNumber);

System.out.printf("The zero is:%d%n",zero);



}

}