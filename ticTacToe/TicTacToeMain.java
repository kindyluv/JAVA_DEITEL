package ticTakToe;

import java.util.Scanner;

import static ticTakToe.Board.*;
import static ticTakToe.Players.PLAYER1;
import static ticTakToe.Players.*;
import static ticTakToe.TicTacToeType.*;


public class TicTacToeMain {
    static String[][] playerBoard = getBoard();
    private boolean playGame = Game.winningPlayer(playerBoard);

    private static Scanner scanner = new Scanner(System.in);
    private static TikTakToe ticTakToe = new TikTakToe();
    private static Board board = new Board(EMPTY);
    private static String[][] playBoard = board.getBoard();
    private static boolean isNotPlaying = Game.winningPlayer(playBoard);
    private static Players player = PLAYER1;


    public static void main(String[] args) {
        String playing = "";

        while (!isNotPlaying) {
            player = getCurrentPlayer(player);
            if (player == PLAYER1) playing = "Player 1";
            else playing = "Player 2";

            ticTakToe.playerMove(player, input(playing));
            isNotPlaying = Game.winningPlayer(playBoard);
            board.printOnBoard();
        }
        System.out.println(playing + " WINS!");
    }

    private static Players getCurrentPlayer(Players player) {
        if (player == PLAYER1) {
            player = PLAYER2;
        } else {
            player = PLAYER1;
        }
        return player;
    }

//    private static int input(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        return scanner.nextInt();
//    }


}

