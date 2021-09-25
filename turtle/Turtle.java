package ChapterSeven.turtleGraphics;

import ChapterSeven.turtleGraphics.PenPosition.*;

import static ChapterSeven.turtleGraphics.Direction. * ;
import static ChapterSeven.turtleGraphics.PenPosition. * ;


public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
//    private Position currentPosition = new Position(0,0);

    public Pen getPen(){
        return pen;
    }

    public void penDown(){
        pen.setPosition(DOWN);
    }

    public void penUp(){
        pen.setPosition(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);
        if(currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
        if(currentDirection == EAST) changeCurrentDirectionTo(SOUTH);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        currentDirection = newDirection;
    }

//    public void turnLeft(){
//        if (currentDirection == WEST) changeCurrentDirectionTo(SOUTH);
//        if (currentDirection == NORTH) changeCurrentDirectionTo(WEST);
//        if (currentDirection == EAST) changeCurrentDirectionTo(NORTH);
//    }

//    public Position getCurrentPosition() {
//        return new Position(0,0);
//    }
}
