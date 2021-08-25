package ChapterSeven;

import java.util.Scanner;

public class ArrayTestOne {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of scores to be stored");
        int studentScores = input.nextInt();
        int[] scores = new int[studentScores];
        System.out.println("Enter student scores");
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int counter = 0; counter < studentScores; counter++){
            scores[counter] = input.nextInt();
            if (highest < scores[counter])
             highest = scores[counter];
            if (lowest > scores[counter])
             lowest = scores[counter];
            total = total + scores[counter];
        }
        int average = total / studentScores;
        System.out.println(highest);
        System.out.println(lowest);
        System.out.println(average);
        System.out.println(total);
    }
}
