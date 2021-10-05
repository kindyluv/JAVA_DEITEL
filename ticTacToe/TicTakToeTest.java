package ticTakToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ticTakToe.Players.*;
import static ticTakToe.TicTacToeType.*;


class TicTakToeTest {
    TikTakToe ticTakToe = new TikTakToe();
//    Board board = new Board(ticTakToe.cellElement);
//    char[][] array = new char[3][3];
////    Players players = ticTakToe.getPlayers();
//
//    @BeforeEach
//    void setUp() {
//        TikTakToe ticTakToe = new TikTakToe();
//    }
//
////    @Test
////    void testThatTicTacToeIsA3By3Array() {
////        var array = ticTakToe.getArray();
////        assertEquals(array, ticTakToe.getArray());
////    }
//
//    @Test
//    void testThatTicTacToeIsEmpty() {
//        assertEquals(TicTacToeType.EMPTY, ticTakToe.getTicTacToe());
//    }
//
//    @Test
//    void testThatTicTacToePlayer1CanPlay() {
//
//        assertSame(PLAYER1, ticTakToe.getPlayers());
//
//    }
//    @Test
//    void testThatTicTacToePlayer2CanPlay() {
//        ticTakToe.playersMood();
//        assertSame(players.PLAYER2, ticTakToe.getPlayers());
//    }
//
//    @Test
//    void testThatTicTacToeCanDisplayTicTakToeBoard() {
//        ticTakToe.displayBoard();
//    }
//
//    @Test
//    void testThatTicTacToePlayers1CanPlayIn1() {
//        ticTakToe.play('X');
//        assertEquals(1, players.getValue());
//    }
//
//    @Test
//    void testThatTicTacToePlayers2CanPlayIn2() {
//        ticTakToe.play('O');
//        assertEquals(0, players.getValue());
//    }
//    @Test
//    void testThatTicTacToePlayerCanNotPlayOnSameCell() {
//        ticTakToe.boardCell();
////        assertEquals();
//    }
    @BeforeEach
    void beforeEach(){
        TikTakToe ticTakToe = new TikTakToe();

    }

    @Test
    void testThatTicTacToeHasABoard(){
        assertNotNull(ticTakToe.getBoard());
    }

    @Test
    void testThatBoardHasElements(){
        assertNotNull(ticTakToe.getCellElement());
    }

    @Test
    void testThatTicTacToeHasTwoPlayers(){
        assertEquals(2, ticTakToe.getPlayers().values().length);
    }

    @Test
    void testThatTicTacToeHasPlayerOne(){
        ticTakToe.setPlayer(PLAYER1);
        assertEquals(PLAYER1, ticTakToe.getPlayers());
    }

    @Test
    void testThatTicTacToeHasPlayerTwo(){
        ticTakToe.setPlayer(Players.PLAYER2);
        assertEquals(Players.PLAYER2, ticTakToe.getPlayers());
    }

    @Test
    void testThatPlayerOneCanPlay(){
        ticTakToe.playerMove(PLAYER1,1);
        assertEquals("X", Board.getBoard()[0][0]);
        ticTakToe.playerMove(PLAYER1,4);
        assertEquals("X", Board.getBoard()[1][0]);
        ticTakToe.playerMove(PLAYER1,5);
        assertEquals("X", Board.getBoard()[1][1]);
        ticTakToe.playerMove(PLAYER1,7);
        assertEquals("X", Board.getBoard()[2][0]);
    }

    @Test
    void testThatPlayerTwoCanPlay(){
        ticTakToe.playerMove(PLAYER2,3);
        assertEquals("O", Board.getBoard()[0][2]);
        ticTakToe.playerMove(PLAYER2,2);
        assertEquals("O", Board.getBoard()[0][1]);
        ticTakToe.playerMove(PLAYER2,9);
        assertEquals("O", Board.getBoard()[2][2]);
        ticTakToe.playerMove(PLAYER2,6);
        assertEquals("O", Board.getBoard()[1][2]);
        ticTakToe.playerMove(PLAYER2,8);
        assertEquals("O", Board.getBoard()[2][1]);
    }

    @Test
    void testThatTicTacToeCanPrintOnBoard(){
        Board ticBoard = new Board();
        ticBoard.printOnBoard();
    }

    @Test
    void testThatBoardIsEmptyByDefault(){
        assertEquals(EMPTY, ticTakToe.getCellElement());
    }

    @Test
    void testThatPlayersCanOnlyMoveToAnEmptyCell(){
        ticTakToe.play();
        assertEquals(EMPTY, ticTakToe.getCellElement());
    }

    @Test
    void testThatTheGameCanBeWonByOneOfThePlayers(){
        ticTakToe.play();
        assertEquals(EMPTY, ticTakToe.getCellElement());
        ticTakToe.playerMove(PLAYER1,1);
        ticTakToe.playerMove(PLAYER1,5);
        ticTakToe.playerMove(PLAYER1,9);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

    @Test
    void testThatGameCanBeWonInRowOne(){
        ticTakToe.playerMove(PLAYER2,1);
        ticTakToe.playerMove(PLAYER2,2);
        ticTakToe.playerMove(PLAYER2,3);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

    @Test
    void testThatGameCanBeWonInRowTwo(){
        ticTakToe.playerMove(PLAYER1,4);
        ticTakToe.playerMove(PLAYER1,5);
        ticTakToe.playerMove(PLAYER1,6);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

    @Test
    void testThatGameCanBeWonInRowThree(){
        ticTakToe.playerMove(PLAYER2, 7);
        ticTakToe.playerMove(PLAYER2,8);
        ticTakToe.playerMove(PLAYER2,9);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

    @Test
    void testThatGameCanBeWonInColumnOne(){
        ticTakToe.playerMove(PLAYER1,1);
        ticTakToe.playerMove(PLAYER1,4);
        ticTakToe.playerMove(PLAYER1,7);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

    @Test
    void testThatGameCanBeWonInColumnTwo(){
        ticTakToe.playerMove(PLAYER2,2);
        ticTakToe.playerMove(PLAYER2,5);
        ticTakToe.playerMove(PLAYER2,8);
        assertTrue(Game.winningPlayer(Board.getBoard()));
    }

//    @Test
//    void testThatGameCanBeWonInColumnThree(){
//        ticTakToe.playerMove(PLAYER1,3);
//        ticTakToe.playerMove(PLAYER1,6);
//        ticTakToe.playerMove(PLAYER1,9);
//        assertTrue(Game.winningPlayer(Board.getBoard()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInDiagonalOne(){
//        ticTakToe.playerMove(PLAYER2,1);
//        ticTakToe.playerMove(PLAYER2,5);
//        ticTakToe.playerMove(PLAYER2,9);
//        assertTrue(Game.winningPlayer(Board.getBoard()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInDiagonalTwo(){
//        ticTakToe.playerMove(PLAYER1,3);
//        ticTakToe.playerMove(PLAYER1,5);
//        ticTakToe.playerMove(PLAYER1,7);
//        assertTrue(Game.winningPlayer(Board.getBoard()));
//    }

//    @Test
//    void testThatBoardCanNotBeOutOfBound(){
//        assertTrue(Board.outOfBound());
//    }

//    @Test
//    void testThatTicTacToeCanDetectFullBoard(){
//        Board ticBoard = new Board();
//        ticBoard.boardIsFull();
//        assertEquals();
//    }
}
