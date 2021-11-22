import java.util.Scanner;

public class TwoPointTwoFour{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter the first number");
int number1 = userInput.nextInt();

System.out.println("Enter the second number");
int number2 = userInput.nextInt();

System.out.println("Enter the third number");
int number3 = userInput.nextInt();

System.out.println("Enter the fourth number");
int number4 = userInput.nextInt();

System.out.println("Enter the fifth number");
int number5 = userInput.nextInt();

int smallest = number1;

if(number2 < smallest)
smallest = number2;

if(number3 < smallest)
smallest = number3;

if(number4 < smallest)
smallest = number4;

if(number5 < smallest)
smallest = number5;

int largest = number1;

if(number2 > largest)
largest = number2;


if(number3 > largest)
largest = number3;


if(number4 > largest)
largest = number4;


if(number5 > largest)
largest = number5;

System.out.printf("The smallest is %d%n", smallest);
System.out.printf("The largest is %d%n", largest);


}

}