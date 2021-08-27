package ChapterSeven;

public class ScoreCalculation {

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
    int position = 4;

        if(playerScore >= 1000) {
        position = 1;
    } else if(playerScore >= 500) {
        position = 2;
    } else if(playerScore >= 100) {
        position = 3;
    }

        return position;
}

    public static void main(String[] args) {

        int score = calculateScore(true, 100,5,50);
        System.out.println("the final score is: " + score );
        int highScore = calculateHighScorePosition(1200);
        displayHighScorePosition("lois", highScore);
    }
}
