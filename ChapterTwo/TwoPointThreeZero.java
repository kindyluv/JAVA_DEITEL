limport java.util.Scanner;

public class TwoPointThreeZero{

	public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);

	System.out.println("Enter Number");

	int number = input.nextInt();
	
	int number1, number2, number3, number4, number5, rNumber, rNumber1, rNumber2, rNumber3;
	
	number1 = number%10; //5
	rNumber = number/10; //1234

	number2 = rNumber%10; //4
	rNumber1 = rNumber/10; //123

	number3 = rNumber1%10; // 3
	rNumber2 = rNumber1/10; // 12

	number4 = rNumber2%10; // 2
	rNumber3 = rNumber2/10; //1

	number5 = rNumber3%10; // 1
	
	System.out.printf("%d   %d   %d   %d   %d",number1, number2, number3, number4, number5);	
			
	}

}


