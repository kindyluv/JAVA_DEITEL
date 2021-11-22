package ChapterSeven;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.reflect.Array.*;

public class StudentRecord {
    private static final Scanner scanner = new Scanner(System.in);
    private static int noOfStudents;
    private static int courseOffer;
    private static int[][] studentNative;
    private static int[] rank;

    public static void scannerClassForAll() {
        System.out.println("Enter number of students: ");
        int studentNumber = scanner.nextInt();
        System.out.println("=".repeat(50));
        System.out.println("Enter number subject offered by each student: ");
        int courses = scanner.nextInt();
        studentNative = new int[studentNumber][courses];
        System.out.println("Enter students scores");
        rank = new int[studentNumber];
    }

    public static void noOfStudents() {

        for (int i = 0; i < studentNative.length; i++) {
            System.out.println("\nStudent  " + (i + 1) + "\n");

            for (int j = 0; j < studentNative[i].length; j++) {
                System.out.print("Course " + (j + 1) + "\t\t");
                studentNative[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n\t\t           ");
    }

    public static void courseOffer() {
        System.out.print("Student" + "\t\t\t");
        for (int i = 0; i < studentNative[courseOffer].length; i++)
            System.out.print("courses " + (i + 1) + "\t");
        System.out.print("  Total" + "\t" + "       Average" + "\t" + "   position");

        System.out.println();
        System.out.println("=".repeat(100));
        for (int i = 0; i < studentNative.length; i++) {
            System.out.print("Student " + (i + 1) + "\t\t\t");
            for (int j = 0; j < studentNative[i].length; j++) {
                System.out.print(studentNative[i][j] + "\t\t\t");
            }
            System.out.print(displayStudentTotalScores()[i] + "\t\t\t");
            System.out.print(displayStudentAverageScores()[i] + "\t\t\t");
            System.out.println(getRanking()[i]);
            System.out.println();
        }
//           System.out.println();
           System.out.println("=".repeat(100));
       }

    public static int[] displayStudentTotalScores() {
        int[] total = new int[studentNative.length];
        for (int i = 0; i < studentNative.length; i++) {
            int sumTotal = 0;
            for (int j = 0; j < studentNative[noOfStudents].length; j++) {
                sumTotal += studentNative[i][j];
                total[i] = sumTotal;
            }
            rank[i] = sumTotal;
        }

        return total;
    }

    public static int[] getRanking(){
        int highest = rank[0];
        int ranking = 0;
        for (int i = 0; i < rank.length; i++){
            for (int j : rank) {
                if (j > highest) {
                    highest = j;
                }
            }
                for (int k = 0; k < rank.length; k++){
                    if (rank[k] == highest){
                        rank[k] = ++ranking;
                        highest = rank[0];
                    }
                }


        }
        return rank;
    }


    public static double[] displayStudentAverageScores() {
        double[] averageTotal = new double[studentNative.length];
        for (int i = 0; i < studentNative.length; i++) {
            double averageSum = 0;
            for (int j = 0; j < studentNative[noOfStudents].length; j++) {
                averageSum += studentNative[i][j];
                averageTotal[i] = averageSum;
            }
        }

        return averageTotal;
    }

    public static void displayHighestScoringStudentRow() {
         int highestScore = Integer.MIN_VALUE;
         int lowestScore = Integer.MAX_VALUE;
         int studentsNo = 0;
         int studentNoColumn = 0;
        for (int i = 0; i < studentNative.length; i++) {
            int total = 0;
            for (int j = 0; j < studentNative[i].length; j++) {
                total += studentNative[i][j];
            }
                    if (total > highestScore) {
                        highestScore = total;
                        studentsNo = i;

                    }
                    if (total < lowestScore) {
                        lowestScore = total;
                        studentNoColumn = i;
                    }

        }
        System.out.println("\nstudent " + (studentsNo + 1) + " is with the highest: " + highestScore);
        System.out.println("student " + (studentNoColumn + 1) + " is with the lowest: " + lowestScore + "\n");
        System.out.println("=".repeat(100) + "\n");
}


    public static void main(String[] args) {
        scannerClassForAll();
        noOfStudents();
        courseOffer();
        displayStudentTotalScores();
        displayStudentAverageScores();
       displayHighestScoringStudentRow();
        getRanking();
    }
}

