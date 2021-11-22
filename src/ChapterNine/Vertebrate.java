package ChapterNine;

public class Vertebrate extends Animal{

    public Vertebrate(){
        System.out.println("who wan create vertebrate");
    }

    public void die(){
        super.die();
    }
    public void move(){
        super.move();
    }
    public void parentMove(){
        super.parentMove();
    }
}
