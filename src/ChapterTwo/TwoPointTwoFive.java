import java.util.Scanner;

public class TwoPointTwoFive{
public static void main(String[] args){
   
Scanner userInput = new Scanner(System.in);

System.out.println("Enter userNumber");
int userNumber = userInput.nextInt();

if((userNumber % 2) != 1){
System.out.println("even");
}
if((userNumber % 2) ==1){
System.out.println("odd");
}
}

}