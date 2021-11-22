package ChapterFour;

public class Earth {
    public static void main(String[] args) {
        Vertebrate tife = new Vertebrate();
        tife.die();
        tife.move();
        tife.parentMove();
        tife.setEyes(50);
        System.out.println(tife.getEyes());
    }
}
