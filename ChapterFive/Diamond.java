package ChapterFive;

import java.util.Scanner;

public class Diamond {
    private static Scanner scanner = new Scanner(System.in);
    private static int input = scanner.nextInt();

    public static void diamondShape(){

        for (int i = 1; i <= input; i++){
            for (int j = input; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++){
                System.out.print("*");
            }
            for (int l = 1; l <= i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = input; k > i; k--){
                System.out.print("*");
            }
            for (int l = input; l >= i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondShape();
    }
}
