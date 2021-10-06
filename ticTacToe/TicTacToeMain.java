package ticTakToe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ticTakToe.CellElement.EMPTY;
import static ticTakToe.Players.PLAYER1;
import static ticTakToe.Players.PLAYER2;


public class TicTacToeMain {

    static int playerMoves(String prompt){
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            System.out.println(prompt);
            input = scanner.nextInt();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return playerMoves(prompt);
        }
        return input;
    }





    public static void main(String[] args) throws Exception {
        WinnerBoard winnerBoard = new WinnerBoard();
        winnerBoard.winningPlayer();
    }




}

