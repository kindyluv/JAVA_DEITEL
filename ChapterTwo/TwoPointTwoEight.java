import java.util.Scanner;
import java.lang.Math;

public class TwoPointTwoEight{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter the radius");
float radius = userInput.nextFloat();

System.out.printf("The diameter is = %f%n", (2.0 * radius));
System.out.printf("The circumference is = %f%n", (2* Math.PI * radius));
System.out.printf("The area is = %f%n", (Math.PI * radius * radius));

}

}