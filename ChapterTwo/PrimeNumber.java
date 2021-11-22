package Chapter5.ChapterTwo;

import java.util.Scanner;


public class PrimeNumber{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number ");

int userInput = input.nextInt();

int numb = 1;

int prime = 1;

while(prime >= userInput){

if(prime % userInput == 0){


prime++;

}

System.out.println("number is not prime number");
}
System.out.println("number is a prime number");

}

}