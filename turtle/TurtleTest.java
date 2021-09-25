package ChapterSeven.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static ChapterSeven.turtleGraphics.Direction. * ;
import static ChapterSeven.turtleGraphics.PenPosition. * ;
import static ChapterSeven.turtleGraphics.Position. *;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle ijapa = new Turtle();
    Pen pen = ijapa.getPen();

    @BeforeEach
    public void StartWithThisBeforeEachTest(){
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
    }

    @Test
    public void testThatTurtleHasPen(){
        //assert
        assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault(){
        //assert
        assertSame(UP, pen.getPosition());

    }

    @Test
    public void testThatTurtleCanMovePenDown(){
        //given
        assertSame(UP, pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(DOWN, ijapa.getPen().getPosition());

    }

    @Test
    public void testThatTurtleCanMovePenUp(){
        //given
        assertSame(PenPosition.UP, pen.getPosition());
        ijapa.penDown();
        //when
        ijapa.penUp();
        //assert
        assertSame(UP, ijapa.getPen().getPosition());

    }
    @Test
    public void testThatTurtleCanMovePenBackUp() {
    //given
        ijapa.penDown();
        assertSame(DOWN, ijapa. getPen().getPosition());
        //assert
        ijapa.penUp();
        assertSame(UP, pen.getPosition());

    }

    @Test
    @DisplayName("Turtle can turn right while facing eat test")
    public void testThatTurtleCanTurnRight(){
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRight2(){
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRight3(){
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    //todo add turn right while facing north test

    @Test
    public void testThatTurtleCanTurnLeft(){
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

//    @Test
//    public void testThatTurtleCanTurnLeft2() {
//        //given
//        ijapa.turnLeft();
//        ijapa.turnLeft();
//        //assert
//        assertSame(WEST, ijapa.getCurrentDirection());
//    }

//    @Test
//    public void testThatTurtleCanTurnLeft3(){
//        //given
//        ijapa.turnLeft();
//        ijapa.turnLeft();
//        ijapa.turnLeft();
//        //assert
//        assertSame(SOUTH, ijapa.getCurrentDirection());
//    }

//    @Test
//    public void testThatTurtleCanMoveForwardWhileFacingEast(){
//        assertSame(new Position(0,0), ijapa.getCurrentPosition());
//    }

}