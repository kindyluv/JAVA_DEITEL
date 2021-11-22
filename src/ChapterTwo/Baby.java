import java.util.Scanner;

public class Baby{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);
 
int number1, number2, number3, number4, number5, number6, number7, baby;

System.out.println("Enter the first number");
 number1 = userInput.nextInt();

System.out.println("Enter the second number");
 number2 = userInput.nextInt();

System.out.println("Enter the third number");
 number3 = userInput.nextInt();

System.out.println("Enter the fouth number");
 number4 = userInput.nextInt();

System.out.println("Enter the fifth number");
 number5 = userInput.nextInt();

System.out.println("Enter the sixth number");
 number6 = userInput.nextInt();

System.out.println("Enter the seven number");
 number7 = userInput.nextInt();

baby = number2 + number3 + number4 + number5 + number6 - number1;

number7 = baby;


}

}