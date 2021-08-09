import java.util.Scanner;

public class ScorePoint1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number = 1;

int total = 0;

int count = 1;

int score;

while(count <= 10){

System.out.printf("Enter number %d%n", number++);

score = input.nextInt();

count = count +1;

total += score;
}

int average = total / 10;
System.out.printf("the total is %d%n", total);
System.out.printf("the average is %d", average);

}

}