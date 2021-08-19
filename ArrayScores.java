package ChapterSeven;

import java.util.Scanner;

public class ArrayScores {

    public static void main(String[] args) {
        System.out.println("Enter number of scores to store");
        Scanner input = new Scanner(System.in);
        int inputScore = input.nextInt();
        int[] score = new int[inputScore];
        for (int i =0; i < score.length; i++){
            System.out.println("Enter scores: " + (i+1));
            score[i] = input.nextInt();
        }

        System.out.println("The smallest value is: " + calculateMinimumValesOf(score));
        System.out.println("The largest value is: " + calculateMaximumValesOf(score));
        System.out.println("The total value is: " + calculateTotalValuesOf(score));
        System.out.println("The average value is: " + calculateAverageValuesOf(score) + "\n");

        for (int j : score) {
            System.out.println("The students scores is: \n" + j);
        }
    }

    public static int calculateMinimumValesOf(int[] score) {
        int smallestValue = score[0];
        for (int i = 0; i < score.length; i++) {
            if (smallestValue > score[i]) {
                smallestValue = score[i];
            }
        }
        return smallestValue;
    }

    public static int calculateMaximumValesOf(int[] score) {
        int largestValue = score[0];
        for (int i = 0; i < score.length; i++) {
            if (largestValue < score[i]) {
                largestValue = score[i];
            }
        }
        return largestValue;
    }

    public static int calculateTotalValuesOf(int[] score) {
        int totalValue = score[0];
        for (int i = 0; i < score.length; i++) {
            totalValue = totalValue + score[i];
        }
        return totalValue;
    }

    public static double calculateAverageValuesOf(int[] score) {
        int averageValue = calculateTotalValuesOf(score) / score.length;
        return averageValue;
    }

}
