package ChapterSeven;

public class StudentHighScore {


    public static void main(String[] args) {
      int highScore =  calculateHighScorePosition(1500);
        displayHighScorePosition("precious", highScore);
        highScore =  calculateHighScorePosition(100);
        displayHighScorePosition("lois", highScore);
        highScore =  calculateHighScorePosition(300);
        displayHighScorePosition("kindyluv", highScore);
        highScore =  calculateHighScorePosition(900);
        displayHighScorePosition("amarachi", highScore);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the table");
    }

    public static int calculateHighScorePosition(int score){
        //score = 0;
        if (score > 1000){
            return 1;
        }
        if (score > 500 && score < 1000){
            return 2;
        }
        if (score > 100 && score < 500){
            return 3;
        }else return 4;

    }
}
