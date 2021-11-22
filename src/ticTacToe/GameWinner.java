package ticTacToe;

import java.util.Objects;
import static ticTacToe.Board.getPlayArray;
import static ticTacToe.CellElement.EMPTY;

public class GameWinner {
 static  String[][] playerBoard = getPlayArray();
   static String empty = String.valueOf(EMPTY);

   public static boolean hasWon(String[][] playerBoard) {
    return isWinningCondition(playerBoard);
   }

    private static boolean isWinningCondition(String[][] playerBoard) {
        return leftDiagonal(playerBoard) ||
                boardRightDiagonal(playerBoard) ||
                boardFirstRow(playerBoard) ||
                boardSecondRow(playerBoard)||
                boardThirdRow(playerBoard)||
                boardFirstColumn(playerBoard) ||
                boardSecondColumn(playerBoard)||
                boardThirdColumn(playerBoard);
    }

    public static boolean isDraw(String[][] playerBoard, int numberOfPlayerPlays) {
       return !hasWon(playerBoard) && numberOfPlayerPlays == 9;
    }

    public static boolean boardThirdColumn(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[0][2], empty) &&
                playerBoard[0][2] == playerBoard[1][2] &&
                playerBoard[0][2] == playerBoard[2][2]);
    }

    public static boolean boardSecondColumn(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][1], empty) &&
               playerBoard[0][1] == playerBoard[1][1] &&
               playerBoard[0][1] == playerBoard[2][1]);
    }

    public static boolean boardThirdRow(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[2][0], empty) &&
                playerBoard[2][0] == playerBoard[2][1] &&
                playerBoard[2][0] == playerBoard[2][2]);
    }

    public static boolean boardSecondRow(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[1][0], empty) &&
                playerBoard[1][0] == playerBoard[1][1] &&
                playerBoard[1][0] == playerBoard[1][2]);
    }

    public static boolean boardRightDiagonal(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][2], empty) &&
               playerBoard[0][2] == playerBoard[1][1] &&
               playerBoard[0][2] == playerBoard[2][0]);
    }

    public  static boolean boardFirstColumn(String[][] playerBoard) {
       return(!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[1][0] &&
               playerBoard[0][0] == playerBoard[2][0]);
    }

    public static boolean boardFirstRow(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[0][1] &&
               playerBoard[0][0] == playerBoard[0][2]);
}

    public static boolean leftDiagonal(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[1][1] &&
               playerBoard[0][0] == playerBoard[2][2]);
    }
}
