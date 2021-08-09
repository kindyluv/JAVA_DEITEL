import java.util.Scanner;

public class ScorePoint{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;

int count = 1;

int score;

while(count <= 10){

System.out.print("Enter your score");

score = input.nextInt();

count = count +1;

total += score;
}

int average = total / 10;
System.out.printf("%d is the total and %d is the average ", total , average);

}

}