package ChapterSeven;

import java.util.Scanner;

public class UdemyClasses {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] mine = getInt(5);
        for (int i = 0; i < mine.length; i++){
            System.out.println("Element " + i + " typed value was "  + mine[i]);
        }
    }

    public static int[] getInt(int numb){
        System.out.println("Enter " + " integer values.\r");
        int[] meat = new int[numb];

        for (int i = 0; i < meat.length; i++){
            meat[i] = scanner.nextInt();
        }
        return meat;
    }
}
