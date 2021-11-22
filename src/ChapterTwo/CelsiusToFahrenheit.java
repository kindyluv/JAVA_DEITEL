// Precious Onyeukwu

import java.util.Scanner;

public class CelsiusToFahrenheit{

public static void main(String[] args){
Scanner userInput = new Scanner(System.in);
System.out.println("Enter a Degree Celsius");

double celsius = userInput.nextDouble();
double fahrenheit = (9.0 / 5) * celsius + 32;

System.out.printf("%f celsius is %f fahrenheit %n", celsius, fahrenheit);
}

}