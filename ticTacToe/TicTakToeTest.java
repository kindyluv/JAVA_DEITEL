package ticTakToe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ticTakToe.Players.*;
import static ticTakToe.CellElement.*;


class TicTakToeTest {
    TikTakToe ticTakToe = new TikTakToe();

    @Test
    void testThatTicTacToeHasAPlayingBoard(){
        assertNotNull(ticTakToe.getPlayArray());
    }

    @Test
    void testThatBoardHasElements(){
        assertNotNull(ticTakToe.getCellElement());
    }

    @Test
    void testThatTicTacToeHasTwoPlayers(){
        assertEquals(2, Players.values().length);
    }

    @Test
    void testThatTicTacToeHasPlayerOne(){
        assertNotNull(PLAYER1);
    }

    @Test
    void testThatTicTacToeHasPlayerTwo(){

        assertNotNull(PLAYER2);
    }

    @Test
    void testThatPlayerOneCanMarkTheBoard(){
        ticTakToe.currentPlayerMarks(PLAYER1,1);
        assertEquals("X", ticTakToe.getPlayArray()[0][0]);
        ticTakToe.currentPlayerMarks(PLAYER1,4);
        assertEquals("X", ticTakToe.getPlayArray()[1][0]);
        ticTakToe.currentPlayerMarks(PLAYER1,5);
        assertEquals("X", ticTakToe.getPlayArray()[1][1]);
        ticTakToe.currentPlayerMarks(PLAYER1,7);
        assertEquals("X", ticTakToe.getPlayArray()[2][0]);
        System.out.println(ticTakToe.printOnBoard());
    }

    @Test
    void testThatPlayerTwoCanMarkTheBoard(){
        ticTakToe.currentPlayerMarks(PLAYER2,3);
        assertEquals("O", ticTakToe.getPlayArray()[0][2]);
        ticTakToe.currentPlayerMarks(PLAYER2,2);
        assertEquals("O", ticTakToe.getPlayArray()[0][1]);
        ticTakToe.currentPlayerMarks(PLAYER2,9);
        assertEquals("O", ticTakToe.getPlayArray()[2][2]);
        ticTakToe.currentPlayerMarks(PLAYER2,6);
        assertEquals("O", ticTakToe.getPlayArray()[1][2]);
        ticTakToe.currentPlayerMarks(PLAYER2,8);
        assertEquals("O", ticTakToe.getPlayArray()[2][1]);
        System.out.println(ticTakToe.printOnBoard());
    }

    @Test
    void testThatBoardIsEmptyByDefault(){
        assertEquals(EMPTY, ticTakToe.getCellElement());
    }

    @Test
    void testThatTheGameCanBeWonByOneOfThePlayers(){
        assertEquals(EMPTY, ticTakToe.getCellElement());
        ticTakToe.currentPlayerMarks(PLAYER1,1);
        ticTakToe.currentPlayerMarks(PLAYER1,5);
        ticTakToe.currentPlayerMarks(PLAYER1,9);
        String prompt = """
                | X |   |   |
                ____________
                |   | X |   |
                _____________
                |   |   | X |

                """;
        assertTrue(GameWinner.hasWon(ticTakToe.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInFirstRow(){
        ticTakToe.currentPlayerMarks(PLAYER2,1);
        ticTakToe.currentPlayerMarks(PLAYER2,2);
        ticTakToe.currentPlayerMarks(PLAYER2,3);
        String prompt = """
                | O | O | O |
                ____________
                |   |   |   |
                _____________
                |   |   |   |

                """;
        assertTrue(GameWinner.boardFirstRow(ticTakToe.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInSecondRow(){
        ticTakToe.currentPlayerMarks(PLAYER1,4);
        ticTakToe.currentPlayerMarks(PLAYER1,5);
        ticTakToe.currentPlayerMarks(PLAYER1,6);
        String prompt = """
                |   |   |   |
                ____________
                | X | X | X |
                _____________
                |   |   |   |

                """;
        assertTrue(GameWinner.boardSecondRow(ticTakToe.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInThirdRow(){
        ticTakToe.currentPlayerMarks(PLAYER2, 7);
        ticTakToe.currentPlayerMarks(PLAYER2,8);
        ticTakToe.currentPlayerMarks(PLAYER2,9);
        String prompt = """
                |   |   |   |
                ____________
                |   |   |   |
                _____________
                | O | O | O |

                """;
        assertTrue(GameWinner.boardThirdRow(ticTakToe.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInFirstColumn(){
        ticTakToe.currentPlayerMarks(PLAYER1,1);
        ticTakToe.currentPlayerMarks(PLAYER1,4);
        ticTakToe.currentPlayerMarks(PLAYER1,7);
        String prompt = """
                | X |  |  |
                ____________
                | X |  |  |
                _____________
                | X |  |  |

                """;
        assertTrue(GameWinner.boardFirstColumn(ticTakToe.getPlayArray()));
    }

//    @Test
//    void testThatGameCanBeWonInSecondColumn(){
//        ticTakToe.currentPlayerMarks(PLAYER2,2);
//        ticTakToe.currentPlayerMarks(PLAYER2,5);
//        ticTakToe.currentPlayerMarks(PLAYER2,8);
//        String prompt = """
//                |  | O |  |
//                ____________
//                |  | O |  |
//                _____________
//                |  | O |  |
//
//                """;
//
//        assertTrue(GameWinner.boardSecondColumn(ticTakToe.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInThreeColumn(){
//        ticTakToe.currentPlayerMarks(PLAYER1,3);
//        ticTakToe.currentPlayerMarks(PLAYER1,6);
//        ticTakToe.currentPlayerMarks(PLAYER1,9);
//        String prompt = """
//                |  |   | X |
//                ____________
//                |   |  | X |
//                _____________
//                |   |  | X |
//
//                """;
//        assertTrue(GameWinner.boardThirdColumn(ticTakToe.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInRightDiagonal(){
//        ticTakToe.currentPlayerMarks(PLAYER2,3);
//        ticTakToe.currentPlayerMarks(PLAYER2,5);
//        ticTakToe.currentPlayerMarks(PLAYER2,7);
//        String prompt = """
//                |   |  | O |
//                ____________
//                |   | O |  |
//                _____________
//                | O |   |  |
//
//                """;
//        assertTrue(GameWinner.boardRightDiagonal(ticTakToe.getPlayArray()));
//
//    }
//
//    @Test
//    void testThatGameCanBeWonInLeftDiagonal() {
//        ticTakToe.currentPlayerMarks(PLAYER1, 9);
//        ticTakToe.currentPlayerMarks(PLAYER1, 5);
//        ticTakToe.currentPlayerMarks(PLAYER1, 1);
//        String prompt = """
//                | X |   |   |
//                ____________
//                |   | X |   |
//                _____________
//                |   |   | X |
//
//                """;
//        assertTrue(GameWinner.leftDiagonal(ticTakToe.getPlayArray()));
//    }
//
//    @Test
//    void testThatTwoPlayersCantPlayOnSamePosition(){
//        ticTakToe.currentPlayerMarks(PLAYER1,4);
//        assertEquals("X", ticTakToe.getPlayArray()[1][0]);
//        assertThrows(IllegalArgumentException.class, ()->ticTakToe.currentPlayerMarks(PLAYER2,4));
//    }
//
//    @Test
//    void testThatPlayersCantPlayOutsideTheBoard(){
//        assertThrows(ArrayIndexOutOfBoundsException.class, () ->ticTakToe.currentPlayerMarks(PLAYER1, 10));
//    }
//
//    @Test
//    void testThatGameCanEndInDraw(){
//        ticTakToe.currentPlayerMarks(PLAYER1, 1);
//        ticTakToe.currentPlayerMarks(PLAYER2, 2);
//        ticTakToe.currentPlayerMarks(PLAYER1, 5);
//        ticTakToe.currentPlayerMarks(PLAYER2, 3);
//        ticTakToe.currentPlayerMarks(PLAYER1, 6);
//        ticTakToe.currentPlayerMarks(PLAYER2, 4);
//        ticTakToe.currentPlayerMarks(PLAYER1, 7);
//        ticTakToe.currentPlayerMarks(PLAYER2, 9);
//        ticTakToe.currentPlayerMarks(PLAYER1, 8);
//        String prompt = """
//                _____________
//                | X | O | O |
//                | O | X | X |
//                | X | X | O |
//                _____________
//                """;
//        assertTrue(GameWinner.isDraw(ticTakToe.getPlayArray(), 9));
//    }

}
