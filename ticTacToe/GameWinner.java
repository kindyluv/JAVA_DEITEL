package ticTakToe;

import java.util.Objects;

import static ticTakToe.Board.getPlayArray;
import static ticTakToe.CellElement.EMPTY;

public class GameWinner {
 static  String[][] playerBoard = getPlayArray();
   static String empty = String.valueOf(EMPTY);

   public static boolean isWon(String[][] playerBoard) {
    return isWinningCondition(playerBoard);
   }

    private static boolean isWinningCondition(String[][] playerBoard) {
        return leftDiagonal(playerBoard) ||
                rightDiagonal(playerBoard) ||
                firstRow(playerBoard) ||
                secondRow(playerBoard)||
                thirdRow(playerBoard)||
                firstColumn(playerBoard) ||
                secondColumn(playerBoard)||
                thirdColumn(playerBoard);
    }

    public static boolean thirdColumn(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[0][2], empty) &&
                playerBoard[0][2] == playerBoard[1][2] &&
                playerBoard[0][2] == playerBoard[2][2]);
    }

    public static boolean secondColumn(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][1], empty) &&
               playerBoard[0][1] == playerBoard[1][1] &&
               playerBoard[0][1] == playerBoard[2][1]);
    }

    public static boolean thirdRow(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[2][0], empty) &&
                playerBoard[2][0] == playerBoard[2][1] &&
                playerBoard[2][0] == playerBoard[2][2]);
    }

    public static boolean secondRow(String[][] playerBoard) {
        return (!Objects.equals(playerBoard[1][0], empty) &&
                playerBoard[1][0] == playerBoard[1][1] &&
                playerBoard[1][0] == playerBoard[1][2]);
    }

    public static boolean rightDiagonal(String[][] playerBoard) {
       return (!Objects.equals(playerBoard[0][2], empty) &&
               playerBoard[0][2] == playerBoard[1][1] &&
               playerBoard[0][2] == playerBoard[2][0]);
    }

//    public  static boolean firstColumn(String[][] playerBoard) {
//       return(!Objects.equals(playerBoard[0][0], empty) &&
//               playerBoard[0][0] == playerBoard[1][0] &&
//               playerBoard[0][0] == playerBoard[2][0]);
//    }
//
//    public static boolean firstRow(String[][] playerBoard) {
//       return (!Objects.equals(playerBoard[0][0], empty) &&
//               playerBoard[0][0] == playerBoard[0][1] &&
//               playerBoard[0][0] == playerBoard[0][2]);
//}
//
//    public static boolean leftDiagonal(String[][] playerBoard) {
//       return (!Objects.equals(playerBoard[0][0], empty) &&
//               playerBoard[0][0] == playerBoard[1][1] &&
//               playerBoard[0][0] == playerBoard[2][2]);
//    }
}
