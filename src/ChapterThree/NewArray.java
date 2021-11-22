import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
   static Scanner scanner = new Scanner(System.in);

    public static int[] array(){
        int[] newNewArray = new int[6];
        int[] newArray = new int[]{1,2,3,4,5,6};
        for (int i = 0; i <= newNewArray.length-1; i++) {
            newNewArray[i] = newArray[i] + 1;
        }
        return newNewArray;
    }

    public static void radiusCalculator(){
        int radius = scanner.nextInt();
        int area = (int) (Math.PI * Math.pow(radius, 2));
        int circumference = (int) (2 * Math.PI * radius);
        System.out.println("area is "+ area + "\n"+"circumference is "+ circumference);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));
        radiusCalculator();
    }


}
