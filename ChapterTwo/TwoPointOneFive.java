import java.util.Scanner;

public class TwoPointOneFive{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter the number1");
int userNumber1 = userInput.nextInt();

System.out.println("Enter number2");
int userNumber2 = userInput.nextInt();


System.out.println("sum is " + (userNumber1 + userNumber2));
System.out.println("multiplication is " + (userNumber1 * userNumber2));
System.out.println("subtraction is " + (userNumber1 - userNumber2));
System.out.println("division is " + (userNumber1 / userNumber2));
}

}