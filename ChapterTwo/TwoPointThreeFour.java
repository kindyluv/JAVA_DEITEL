import java.util.Scanner;

public class TwoPointThreeFour{

public static void main(String[] args){ 

Scanner userInput = new Scanner(System.in);

int growthRate, populationChangeA, populationChangeB, time;

System.out.println("Enter number of years");

time = userInput.nextInt();

growthRate = 86900000;

populationChangeA = 790000000;

populationChangeB = growthRate + populationChangeA;

System.out.printf("world population after %d years would be %d%n", time, populationChangeB);


}

}