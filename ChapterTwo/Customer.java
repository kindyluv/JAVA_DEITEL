import java.util.Scanner;

public class Customer{
public static void main(String[] args){

Scanner customerInput = new Scanner(System.in);

int number = 0;

System.out.println("Enter number");
number = customerInput.nextInt();

if(number == 0)

System.out.printf("%d", 1);
else
System.out.printf("%d", 0);

}


}