package ChapterFive;

import java.util.Scanner;

public class ForLoop {
    private static Scanner scanner = new Scanner(System.in);
    private static int input = scanner.nextInt();


    public static void forLoopThree(){
        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = input; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println("");
    }

    public static void forLoopOne(){

        for (int i = 1; i <= input; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      //  System.out.println("");
    }

    public static void forLoopTwo(){

        for (int i = input; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void forLoopFour(){
        for (int i = input; i >= 1; i--){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = input; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void forLoopFive(){
        for (int i = 1; i <= input; i++) {
            for (int j = input; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int m = 1; m <= input; m++) {
                for (int n = 1; n <= m; n++) {
                    System.out.print(" ");
                }
                for (int o = input; o > m; o--) {
                    System.out.print("*");
                }
                for (int p = input; p >= m; p--) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {

        forLoopOne();
        forLoopTwo();
        forLoopFour();
        forLoopThree();
        forLoopFive();

    }
}
