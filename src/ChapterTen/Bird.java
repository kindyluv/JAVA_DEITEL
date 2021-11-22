package ChapterTen;

public class Bird extends Animal implements Movable{

    @Override
    public void move() {
        System.out.println("I can fly");
    }
}
