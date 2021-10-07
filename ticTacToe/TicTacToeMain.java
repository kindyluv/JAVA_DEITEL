package ticTakToe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ticTakToe.CellElement.*;
import static ticTakToe.Players.*;


public class TicTacToeMain {
    static Scanner scanner = new Scanner(System.in);
    static TikTakToe ticTakToe = new TikTakToe();
    static CellElement cellElement = EMPTY;
    static Board board = new Board(cellElement);
    static String[][] playBoard = board.getPlayArray();
    static boolean stopGame = GameWinner.isWon(playBoard);
    static Players player = PLAYER2;


    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        String gamePlayer = "";
        while (!stopGame) {
            player = ticTakToe.getPlayers(player);
            if (player == PLAYER1) gamePlayer = "Player 1";
            else if (player == PLAYER2) gamePlayer = "Player 2";
            getInputFromPlayer(player);
            stopGame = GameWinner.isWon(playBoard);
            printOnBoard();
        }
        System.out.println(gamePlayer + " IS THE WINNER OF THE GAME!");

    }

//    private static void getInputFromPlayer(Players player) {
//        try {
//            System.out.printf("%s: ", player.name());
//            int input = scanner.nextInt();
//            ticTakToe.currentPlayerMarks(player, input);
//        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//            getInputFromPlayer(player);
//        }
//    }
//
//    public static void printOnBoard() {
//        System.out.println("_____________");
//        for (int row = 0; row < playBoard.length; row++) {
//            System.out.print("| ");
//            for (int column = 0; column < playBoard[row].length; column++) {
//                if (playBoard[row][column].equals(String.valueOf(EMPTY)))
//                    System.out.print("_");
//                else System.out.print(playBoard[row][column]);
//                System.out.print(" | ");
//            }
//            System.out.println();
//        }
//        System.out.println("_____________");
//    }
}

