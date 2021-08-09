import java.util.Scanner;

public class TwoPointOneSeven{
   public static void main(String[] args){

Scanner userInput = new Scanner(System.in);
 
int number1, number2, number3;
int sum, average, product;

System.out.println("Enter firstNumber");
number1 = userInput.nextInt();

System.out.println("Enter secondNumber");
number2 = userInput.nextInt();

System.out.println("Enter thirdNumber");
number3 = userInput.nextInt();

sum = number1 + number2 + number3;
average = sum / 3;
product = number1 * number2 * number3;

System.out.printf("sum %d, average %d, product %d%n", sum, average, product);

if(number1 > number2 && number1 > number3){
System.out.printf("%d is largest number", number1);
}
if(number2 > number1 && number2 > number3){
System.out.printf("%d is the largest number", number2);
}
if(number3 > number1 && number3 > number2){
System.out.printf("%d is the largest number", number3);
}

   }

}