// Ask for user score

// if the score is greater or equal to 60 
// print passed

// if the score is lesser than 60 
// print failed

import java.util.Scanner;

public class Score{


public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter user score");
 int score = input.nextInt();
 
if(score >= 60){
System.out.println("Passed");
}else {
System.out.println("Failed");
}

}

}

