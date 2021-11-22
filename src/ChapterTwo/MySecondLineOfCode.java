package Chapter5.src.ChapterTwo;

import java.util.Scanner;

public class MySecondLineOfCode{

public static void main(String[] args){

Scanner input=new Scanner(System.in);
System.out.println("Enter a Number");

int firstNumber = input.nextInt();
System.out.println("Enter another Number");

int secondNumber = input.nextInt();
System.out.printf("the sum of %d and %d is%d%n",
firstNumber,secondNumber,firstNumber+secondNumber); 
}

}