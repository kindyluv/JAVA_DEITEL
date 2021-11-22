package ChapterSeven;

import java.util.*;

public class UdemyClasses {

    private static Scanner scanner = new Scanner(System.in);
    private static int[][] array1 = new int[2][2];

    public static void main(String[] args) {
        int[] mine = getInt(5);
        for (int i = 0; i < mine.length; i++) {
            System.out.println("Element " + i + " typed value was " + mine[i]);
            getIntegers(array1);

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
    public static void getIntegers(int[][] scores){
        int score = 0;
       // int[][] array1 = new int[numbs][0];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                score = scores[i][j];
                System.out.println(score);
            }
        }
    }


}
