package ChapterSeven;

import java.util.Scanner;

public class ArrayClassWork {

    public static void main(String[] args) {
        getArray();
        ticTak();
        tictaktoe();
    }

    public static String[][] getArray() {
        String[][] arrays = {{"X", "O", "X"}, {"O", "X", "O"}, {"X", "O", "X"}};
        //  String []  = new String[3];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(" " + arrays[i][j]);
            }
            System.out.println();
        }
        return arrays;
    }

    public static String[][] ticTak() {
        String[][] tic = new String[3][3];
        tic[0][0] = "X";
        tic[0][1] = "O";
        tic[0][2] = "X";
        tic[1][0] = "O";
        tic[1][1] = "X";
        tic[1][2] = "O";
        tic[2][0] = "X";
        tic[2][1] = "O";
        tic[2][2] = "X";

        for (int i = 0; i < tic.length; i++) {
            for (int j = 0; j < tic[i].length; j++) {
                System.out.print(" " + tic[i][j]);
            }
            System.out.println();
        }
        return tic;
    }

    public static int[][] tictaktoe() {
        //int[][] tak = new int[3][];
       int[][] tak = {{1,2,3,4},{1,2,3},{1,2},{1}};
        tak[0] = new int[4];
        tak[1] = new int[3];
        tak[2] = new int[2];
        tak[3] = new int[1];
      //  tak[4] = new int[0];
        for (int i = 0; i < tak.length; i++){
            for (int j = 0; j < tak[i].length; j++){
               // tak[i][j] = scanner.nextInt();
                System.out.print(" " + tak[i][j]);
            }
            System.out.println();
        }
        return tak;
    }
}
