package ticTakToe;

import static ticTakToe.Players.*;
import static ticTakToe.CellElement.*;

class TikTakToe {
    private CellElement cellElement = EMPTY;
    private Board board = new Board(cellElement);
    private String[][] playArray = board.getPlayArray();
    private Players player = PLAYER1;

    public String[][] getPlayArray() {
        return playArray;
    }

    public CellElement getCellElement() {
        return cellElement;
    }

    public void switchPlayers() {
        if (player == PLAYER1) player = PLAYER2;
        else if (player == PLAYER2) player = PLAYER1;
    }

//    public Players getPlayer() {
//        return player;
//    }
//
//    public void currentPlayerMarks(Players player, int position) {
//        if (position > 0 && position < 10) {
//            if (player == PLAYER1) setPosition(position, X);
//            else if (player == PLAYER2) setPosition(position, O);
//        }
//        else throw new ArrayIndexOutOfBoundsException("You can only play between 1 & 9");
//    }
//
//    public void turnUserInputToBoardPosition(int position, CellElement cellElement) {
//        switch (position){
//            case 1 -> validateAndAcceptPlayerPosition(0,0, cellElement);
//            case 2 -> validateAndAcceptPlayerPosition(0,1, cellElement);
//            case 3 -> validateAndAcceptPlayerPosition(0,2, cellElement);
//            case 4 -> validateAndAcceptPlayerPosition(1,0, cellElement);
//            case 5 -> validateAndAcceptPlayerPosition(1,1, cellElement);
//            case 6 -> validateAndAcceptPlayerPosition(1,2, cellElement);
//            case 7 -> validateAndAcceptPlayerPosition(2,0, cellElement);
//            case 8 -> validateAndAcceptPlayerPosition(2,1, cellElement);
//            case 9 -> validateAndAcceptPlayerPosition(2,2, cellElement);
//        }
//    }
//
//    private void validateAndAcceptPlayerPosition(int rowPosition, int columnPosition,CellElement board) {
//        if (!playArray[rowPosition][columnPosition].equals(EMPTY.name())) throw new IllegalArgumentException("Position is already filled");
//        else playArray[rowPosition][columnPosition] = String.valueOf(board);
//    }
//
//    public void setPosition(int position, CellElement board){
//        turnUserInputToBoardPosition(position, board);
//    }
//
//    public StringBuilder printOnBoard() {
//        StringBuilder displayPlayboard = new StringBuilder();
//        displayPlayboard.append("_____________\n");
//        for (String[] rows : playArray) {
//            displayPlayboard.append("| ");
//            for (String column : rows) {
//                if (column.equals(String.valueOf(EMPTY))) displayPlayboard.append("_");
//                else displayPlayboard.append(column);
//                displayPlayboard.append(" | ");
//            }
//            displayPlayboard.append("\n");
//        }
//        displayPlayboard.append("_____________");
//        return displayPlayboard;
//    }
}
