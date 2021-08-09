import java.util.Scanner;

public class TwoPointTwoSix{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter the firstNumber");
int userNumber1 = userInput.nextInt();

System.out.println("Enter the secondNumber");
int userNumber2 = userInput.nextInt();

if((userNumber2 % userNumber1) == 0){
System.out.printf("the first userNumber (%d) is a multiple of the second userNumber (%d)%n", userNumber1, userNumber2);
}

if((userNumber2 % userNumber1) != 0){
System.out.printf("the first userNumber (%d) is not a multiple of the second userNumber (%d)%n", userNumber1, userNumber2);
}

}

}