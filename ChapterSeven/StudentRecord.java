package ChapterSeven;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.reflect.Array.*;

public class StudentRecord {
    private static final Scanner scanner = new Scanner(System.in);
    private static int noOfStudents;
    private static int courseOffer;
    private static int[][] studentNative;

    public static void scannerClassForAll() {
        System.out.println("Enter number of students: ");
        int studentNumber = scanner.nextInt();
        System.out.println("=".repeat(50));
        System.out.println("Enter number subject offered by each student: ");
        int courses = scanner.nextInt();
        studentNative = new int[studentNumber][courses];
        System.out.println("Enter students scores");
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
            System.out.print("courses:" + (i + 1) + "\t");

        System.out.println();
        System.out.println("=".repeat(100));
        for (int i = 0; i < studentNative.length; i++) {
            System.out.print("Student " + (i + 1) + "\t\t\t");
            for (int j = 0; j < studentNative[i].length; j++) {
                System.out.print(studentNative[i][j] + "\t\t\t");
            }
            System.out.println();
            System.out.println("=".repeat(100));
        }
    }

    public static void displayStudentRowTotalScores() {

        for (int i = 0; i < studentNative.length; i++) {
            int total = 0;
            double average = 0;
            // int total = 0;
            for (int j = 0; j < studentNative[noOfStudents].length; j++) {
                total += studentNative[i][j];
                average = total / studentNative[noOfStudents].length;

            }
            System.out.println("Total of student " + (i + 1) + " is: " + total);
            System.out.println("Average of student " + (i + 1) + " is " + average + "\n");
        }
        System.out.println("=".repeat(100) + "\n");
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
        System.out.println("student " + (studentsNo + 1) + " is with the highest: " + highestScore);
        System.out.println("student " + (studentNoColumn + 1) + " is with the lowest: " + lowestScore + "\n");
        System.out.println("=".repeat(100) + "\n");
}

    public static void getStudentRankingPerStudent() {
        int rank = 0;
         int position = 0;
         int row = 0;
         int column = 0;
         for (int i = 0; i < studentNative.length; i++) {
             int total = 0;
             for (int j = 0; j < studentNative.length; j++) {
                 total += studentNative[i][j];
                 if (total > rank) {
                     position = 1;
                     row = i;
                 }else
                     position = 4;
                 column = i;
             }
         }
       System.out.println("Student " + (row + 1) + position);
    }


    public static void main(String[] args) {
        scannerClassForAll();
        noOfStudents();
        courseOffer();
        displayStudentRowTotalScores();
       displayHighestScoringStudentRow();
        getStudentRankingPerStudent();
    }
}

