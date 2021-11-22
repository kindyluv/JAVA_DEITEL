// Precious Onyeukwu

import java.util.Scanner;
import java.lang.Math;

public class Cylinder{

public static void main(String[] args){

Scanner userInput = new Scanner(System.in);
System.out.println("Enter radius of cylinder");
double radius = userInput.nextDouble();

System.out.println("Enter lenght of cylinder");
double lenght = userInput.nextDouble();

double area = radius * radius*Math.PI;
double volume = area * lenght;

System.out.printf("the area is %f", area);
System.out.printf("the volume is %f", volume);

}

}