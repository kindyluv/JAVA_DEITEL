import java.util.Scanner;
import java.lang.Math;

public class TwoPointThreeThree{

public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

float weightInPounds, heightInInches, BMI;

System.out.println("Enter Weight in Pounds");
weightInPounds = userInput.nextFloat();

System.out.println("Enter heightInInches");
heightInInches = userInput.nextFloat();

BMI = (weightInPounds * 703) / (heightInInches * heightInInches);

System.out.printf("User Body Mass Index is, %f%n%n", BMI);

System.out.println("BMI VALUES ");
System.out.println("Underweight: Less than 8.5");
System.out.println("Normal: between 18.5 and 24.9");
System.out.println("Overweight: between 25 and 29.9");
System.out.println("Obese: 30 or greater");


}

}