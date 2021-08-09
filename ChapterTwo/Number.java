import java.util.Scanner;
import java.lang.Math;

public class Number{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

int number1, number2, number3, number4 , sequence;

System.out.println("Enter firstNumber");
number1 = userInput.nextInt();

System.out.println("Enter secondNumber");
number2 = userInput.nextInt();

System.out.println("Enter thirdNumber");
number3 = userInput.nextInt();

sequence = number2 + number3 - number1;
number4 = sequence;

System.out.printf("The fourth number is %d%n", number4);
}

}