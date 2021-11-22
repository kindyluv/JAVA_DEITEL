//package ticTakToe;
//
//import java.util.Objects;
//
//import static ticTakToe.Board.array;
//import static ticTakToe.Board.getBoard;
//import static ticTakToe.Players.*;
//import static ticTakToe.TicTacToeType.EMPTY;
//
//public class Game {
// String[][] playerBoard = getBoard();
//// private String[][] playerBoard = new String[row][column];
//
//   public static boolean winningPlayer(String[][] playerBoard) {
//   String empty = String.valueOf(EMPTY);
//    return(!Objects.equals(playerBoard[0][0], empty) && playerBoard[0][0] == playerBoard[1][1] && playerBoard[0][0] == playerBoard[2][2])||
//          (!Objects.equals(playerBoard[0][0], empty) && playerBoard[0][0] == playerBoard[0][1] && playerBoard[0][0] == playerBoard[0][2])||
//          (!Objects.equals(playerBoard[0][0], empty) && playerBoard[0][0] == playerBoard[1][0] && playerBoard[0][0] == playerBoard[2][0])||
//
//          (!Objects.equals(playerBoard[1][0], empty) && playerBoard[1][0] == playerBoard[1][1] && playerBoard[1][0] == playerBoard[1][2])||
//          (!Objects.equals(playerBoard[2][0], empty) && playerBoard[2][0] == playerBoard[2][1] && playerBoard[2][0] == playerBoard[2][2])||
////
//          (!Objects.equals(playerBoard[0][1], empty) && playerBoard[0][1] == playerBoard[1][1] && playerBoard[0][1] == playerBoard[2][1])||
//          (!Objects.equals(playerBoard[0][2], empty) && playerBoard[0][2] == playerBoard[1][2] && playerBoard[0][2] == playerBoard[2][2])||
//          (!Objects.equals(playerBoard[0][2], empty) && playerBoard[0][2] == playerBoard[1][1] && playerBoard[0][2] == playerBoard[2][0]);
//   }
//
//
//}
