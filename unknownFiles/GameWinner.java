package Chapter5.unknownFiles;

import java.util.Objects;

import static ticTakToe.Board.getPlayArray;
import static Chapter5.unknownFiles.CellElement.EMPTY;

public class GameWinner {
 static  String[][] playerBoard = getPlayArray();
   static String empty = String.valueOf(EMPTY);

   public static boolean isWon(String[][] playerBoard) {
    return isWinningCondition(playerBoard);
   }

    private static boolean isWinningCondition(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
        return leftDiagonal(playerBoard) ||
                rightDiagonal(playerBoard) ||
                firstRow(playerBoard) ||
                secondRow(playerBoard)||
                thirdRow(playerBoard)||
                firstColumn(playerBoard) ||
                secondColumn(playerBoard)||
                thirdColumn(playerBoard);
    }

    static boolean thirdColumn(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
        return (!Objects.equals(playerBoard[0][2], empty) &&
                playerBoard[0][2] == playerBoard[1][2] &&
                playerBoard[0][2] == playerBoard[2][2]);
    }

    static boolean secondColumn(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
       return (!Objects.equals(playerBoard[0][1], empty) &&
               playerBoard[0][1] == playerBoard[1][1] &&
               playerBoard[0][1] == playerBoard[2][1]);
    }

    static boolean thirdRow(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
        return (!Objects.equals(playerBoard[2][0], empty) &&
                playerBoard[2][0] == playerBoard[2][1] &&
                playerBoard[2][0] == playerBoard[2][2]);
    }

    static boolean secondRow(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
        return (!Objects.equals(playerBoard[1][0], empty) &&
                playerBoard[1][0] == playerBoard[1][1] &&
                playerBoard[1][0] == playerBoard[1][2]);
    }

    static boolean rightDiagonal(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
       return (!Objects.equals(playerBoard[0][2], empty) &&
               playerBoard[0][2] == playerBoard[1][1] &&
               playerBoard[0][2] == playerBoard[2][0]);
    }

    static boolean firstColumn(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
       return(!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[1][0] &&
               playerBoard[0][0] == playerBoard[2][0]);
    }

    static boolean firstRow(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
       return (!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[0][1] &&
               playerBoard[0][0] == playerBoard[0][2]);
}

    static boolean leftDiagonal(String[][] playerBoard) throws ArrayIndexOutOfBoundsException{
       return (!Objects.equals(playerBoard[0][0], empty) &&
               playerBoard[0][0] == playerBoard[1][1] &&
               playerBoard[0][0] == playerBoard[2][2]);
    }
}
