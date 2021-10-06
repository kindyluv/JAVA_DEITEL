package ticTakToe;

import static ticTakToe.Players.*;
import static ticTakToe.CellElement.*;

class TikTakToe {
    private CellElement cellElement = EMPTY;
    private Board board = new Board(cellElement);
    private Players players = PLAYER2;
    private String[][] playArray = Board.getPlayArray();

    public String[][] getPlayArray() {
        return playArray;
    }

    public CellElement getCellElement() {
        return cellElement;
    }

    public Players getPlayers() {
        return players;
    }

    public void currentPlayerMoves(Players player, int position) {
        if (position > 9) throw new ArrayIndexOutOfBoundsException("You can only play between 1 & 9");
        else {
            if (player == PLAYER1) setPosition(position, X);
            else if (player == PLAYER2) setPosition(position, O);
        }
    }

    public void setPlayer(Players player) {
        this.players = player;
    }

    public String[][] getArray() {
        return Board.array;
    }

    public void turnUserInputToBoardPosition(int position, CellElement board) {
        switch (position){
            case 1 -> playArray[0][0] = String.valueOf(board);
            case 2 -> playArray[0][1] = String.valueOf(board);
            case 3 -> playArray[0][2] = String.valueOf(board);
            case 4 -> playArray[1][0] = String.valueOf(board);
            case 5 -> playArray[1][1] = String.valueOf(board);
            case 6 -> playArray[1][2] = String.valueOf(board);
            case 7 -> playArray[2][0] = String.valueOf(board);
            case 8 -> playArray[2][1] = String.valueOf(board);
            case 9 -> playArray[2][2] = String.valueOf(board);
        }
    }

    public void setPosition(int position, CellElement board){
        turnUserInputToBoardPosition(position, board);
    }
}










