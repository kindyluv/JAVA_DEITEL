package guessingGame;

import java.util.Scanner;

public class GuessGame {

    public String scannerClass(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    public void game(){
        int isPlayingMode = 3;
        int guessNumber = (int) (Math.random() * 20);

        while(isPlayingMode > 0) {

            System.out.println("Lets play a guessing game!");
            System.out.println("I'm thinking of a number between 1 and 20");
            int games = getGameInputs();

            if ((games <= 0) || (games > 20)) {
                System.out.println("you entered a wrong option its between 1 to 20");
                System.out.println("Y or N to play again: ");
                String answer = scannerClass();
                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Lazy Ass Na Ordinary Game They Fear you ");
                    break;}
                else if (answer.equalsIgnoreCase("Y")) continue;
                game();

            } else if (games < guessNumber) {
                System.out.println("Your guess is lower than the guess number");
            } else if (games > guessNumber) {
                System.out.println("Your guess is higher then the guess number");
            } else {
                System.out.println("You got the right answer");
                break;
            }
            --isPlayingMode;
            endOfGame(isPlayingMode, guessNumber);
        }
    }

//    private void endOfGame(int isPlayingMode, int guessNumber) {
//        if (isPlayingMode == 0) {
//            System.out.println("Wooooow!\nYou can never make it, gaddamit!");
//            System.out.println("Bloody Wimp!!!\nThe answer is: " + guessNumber + "\n OLODO BANTI BANTI");
//        }
//    }
//
//    private int getGameInputs() {
//        String game = scannerClass();
//        int games = Integer.parseInt(game);
//        System.out.println("what do you think it is? " + game);
//        return games;
//    }
//
//    public static void main(String[] args) {
//        GuessGame game = new GuessGame();
//        game.game();
//    }
}
