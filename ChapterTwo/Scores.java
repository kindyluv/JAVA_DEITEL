//Ask for user score

//if score is 90 to 100
// display A

//if score is 80 to 89
//display B

//if score is 70 to 79
//display C

//if score is 60 to 69
//display D

// if score is below 60 
//display F


import java.util.Scanner;

public class Scores{


public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.println("Enter user score");

int score = input.nextInt();

if(score < 60){
System.out.println("F");
}

if(score >=60 && score <= 69){
System.out.println("D");
}

if(score >=70 && score <= 79){
System.out.println("C");
}

if(score >= 80 && score <= 89){
System.out.println("B");
}

if(score >= 90 && score <= 100){
System.out.println("A");
}

}

}