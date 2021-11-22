import java.util.Scanner;
public class TwoPointOneSix{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter firstNumber");
int userNumber1 = userInput.nextInt();

System.out.println("Enter firstNumber");
int userNumber2 = userInput.nextInt();

if(userNumber1==userNumber2){
System.out.println("These numbers are equal");
}
if(userNumber1 > userNumber2){
System.out.println("number1 is larger than number2");
}
if(userNumber1 < userNumber2){
System.out.println("number2 is larger than number1");
}

}

}