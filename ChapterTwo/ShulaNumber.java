// Precious Onyeukwu

import java.util.Scanner;

public class ShulaNumber{

public static void main(String[] args){

Scanner buyerInput = new Scanner(System.in);
System.out.println("Enter Number");

int buyerNumber = buyerInput.nextInt();
int mysteryNumber = 1000;

if(mysteryNumber==buyerNumber){
System.out.println("correct");
}
if(mysteryNumber>buyerNumber){
System.out.println("Too low please try again later");
}
if(mysteryNumber<buyerNumber){
System.out.println("Too high please try again later");
}
}

}