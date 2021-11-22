package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of scores to be stored");
        int stud = input.nextInt();
      int highest = Integer.MIN_VALUE;
      int lowest = Integer.MAX_VALUE;
      int total = 0;
        int[] scores = new int[stud];
        for (int i = 0; i < stud; i++){
            System.out.println("Enter students scores");
            scores[i] = input.nextInt();
            total = total + scores[i];
            if (highest < scores[i])
                highest = scores[i];

            if (lowest > scores[i])
                lowest = scores[i];
        }
        int average = total / stud;
        System.out.println(average);
        System.out.println(total);
        System.out.println(highest);
        System.out.println(lowest);
    }
}
