package ticTacToe;

import java.util.Arrays;

public class Board {
    private static final int row = 3;
    private static final int column = 3;
    public static String[][] array = new String[row][column];


    public Board(CellElement cellElement) {
        for (String[] strings : array) {
            Arrays.fill(strings, String.valueOf(cellElement));
        }
    }

    public static String[][] getPlayArray() {
        return array;
    }
}
