import java.util.Scanner;

public class NativeNumber{

public static void main(String[] args) {

Scanner customerInput = new Scanner(System.in);
System.out.println("Enter NativeNumber");
int customerNumber = customerInput.nextInt();
int mysteryNumber = 10;

if(mysteryNumber==customerNumber){
System.out.println("correct");
}
if(mysteryNumber>customerNumber){
System.out.println("too low try again later");
}
if(mysteryNumber<customerNumber){
System.out.println("too high try again later");
}
}


}