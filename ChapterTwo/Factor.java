import java.util.Scanner;

public class Factor{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number");

int userInput = input.nextInt();

int factor = 1;

System.out.println("factors are ");

while(factor <= userInput){

if(userInput % factor == 0){

System.out.print(factor + " ");   
 }
factor++;

}
System.out.println();
}

}