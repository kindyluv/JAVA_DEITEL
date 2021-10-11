package ticTakToe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ticTakToe.CellElement.*;
import static ticTakToe.Players.*;

public class TicTacToeMain {
    private static TikTakToe ticTakToe = new TikTakToe();
    private static CellElement cellElement = EMPTY;
    private static Board board = new Board(cellElement);
    private static String[][] playBoard = Board.getPlayArray();
    private static int numberOfPlaysCounter = 0;
    static boolean stopGame = GameWinner.hasWon(playBoard) || GameWinner.isDraw(playBoard, numberOfPlaysCounter);

    public static void main(String... args) {
        playGame();
    }

    public static void playGame() {
        String gamePlayer = "";

        while (!stopGame) {
            Players player = ticTakToe.getPlayer();
            if (player == PLAYER1) gamePlayer = "Player 1";
            else if (player == PLAYER2) gamePlayer = "Player 2";
            validateUserInputAndMarkBoardOf(player);
            ++numberOfPlaysCounter;
            stopGame = GameWinner.hasWon(playBoard) || GameWinner.isDraw(playBoard, numberOfPlaysCounter);
            System.out.println(ticTakToe.printOnBoard());
            ticTakToe.switchPlayers();
        }
//        System.out.println(gamePlayer + " IS THE WINNER OF THE GAME!");
        if (GameWinner.hasWon(playBoard)) System.out.println(gamePlayer + " has won the game");
        else if (GameWinner.isDraw(playBoard, numberOfPlaysCounter)) System.out.println("The game is a tie");
    }

    private static void validateUserInputAndMarkBoardOf(Players player) {
        try {
            ticTakToe.currentPlayerMarks(player, collectInputFrom(player));
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
            validateUserInputAndMarkBoardOf(player);
        }
        catch(InputMismatchException e){
            System.err.println("You can only enter a digit/ number");
            validateUserInputAndMarkBoardOf(player);
        }
    }

    private static int collectInputFrom(Players player) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s: ", player.name());
        return scanner.nextInt();
    }
}
