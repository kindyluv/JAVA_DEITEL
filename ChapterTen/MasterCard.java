package ChapterTen;

public class MasterCard extends CreditCard implements Movable{
    @Override
    public int someThings(int pass) {
        int me = 50;
        return me;
    }

    @Override
    public void move() {
        System.out.println("We move");
    }
}
