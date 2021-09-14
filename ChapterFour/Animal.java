package ChapterFour;

public class Animal extends LivingThing{
    private int eyes;

    public Animal(){
        System.out.println("who wan create animal");
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    @Override
    public void move(){
        System.out.println("waka waka no dey tire");
    }
@Override
    public void die(){
        System.out.println("i shall not die young");
    }
    @Override
    public void parentMove(){
        System.out.println("Go placidly amid the noise an haste");
    }



}
