//package ChapterSeven;
//
//import java.util.Scanner;
//
//public class ArrayTestTwo<isTotal, displaystudentPosition> {
//    private static Scanner scanner = new Scanner(System.in);
//    private static int noOfStudents;
//    private static int courseOffer;
//    private static int[][] studentNative;
//
//
//    //prompt user to enter number of students
//    //prompt user to enter number of subject they offer
//    //prompt user to enter the scores for each student subject
//    //students scores should be displayed in a tabular form
//    //display each student total and average scores
//    //rank the students position i.e 1 == 1st position, 2 == 2nd position
//    //display a summary results of all student
//    //display the highest,lowest scoring student
//    //display highest,lowest,average scoring student per subject
//
//    public static void numberOfStudents() {
//        System.out.println("Enter number of students: ");
//        int studentNumber = scanner.nextInt();
//        System.out.println("----------------------------------------------");
//
//        System.out.println("Enter number subject offered by each student: ");
//        int courses = scanner.nextInt();
//
//        studentNative = new int[studentNumber][courses];
//        for (int i = 0; i < studentNative.length; i++) {
//            System.out.println("\nStudent  " + (i + 1) + "\n");
//
//            for (int j = 0; j < studentNative[i].length; j++) {
//                System.out.print("Course " + (j + 1) + "\t");
//                studentNative[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("\n\t\t           ");
//
//        for (int i = 0; i < courses; i++)
//            System.out.print("        courses " + (i + 1));
//
//        System.out.println();
//
//        System.out.println("---------------------------------------------");
//        for (int i = 0; i < studentNative.length; i++) {
//            System.out.print("Student " + (i + 1) + "\t\t");
//            for (int j = 0; j < studentNative[i].length; j++) {
//                System.out.print(studentNative[i][j] + "\t\t\t");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void getScoresPerStudents(int studentNumber) {
//        //  Scanner scanner = new Scanner(System.in);
//        //  System.out.println("Enter scores for each students: ");
//        //  int scores = scanner.nextInt();
//
//
//        for (int i = 0; i < studentNumber; i++) {
//            if (studentNumber <= 100 && studentNumber >= 80) {
//                System.out.println("1");
//            } else if (studentNumber <= 79 && studentNumber >= 60) {
//                System.out.println("2");
//            } else if (studentNumber <= 59 && studentNumber >= 40) {
//                System.out.println("3");
//            } else if (studentNumber <= 49 && studentNumber >= 30) {
//                System.out.println("4");
//            }
//        }
//    }
//
//    public static void displayStudentTotalScores(int... studentNumber) {
//
//        for (int i = 0; i < ; i++){
//            int total = 0;
//        for (int j = 0; j < studentNative.length; j++){
//            total += studentNative[i][j];
//        }
//            System.out.println("Total of student number is: " + (i+1) + " is; " + total);
//        }
//
//
//        for (int i = 0; i < studentNative.length; i++) {
//            int total = 0;
//            for (int j = 0; j < studentNative.length; j++) {
//                total += studentNumber[i];
//            }
//            System.out.println("Total of student courses is: " + (i+1) + " is; " + total);
//        }
//
//    }
//
//    public static void displayStudentAverageScores(int... studentNumber) {
//        displayStudentTotalScores(studentNumber);
//        double average = displayStudentTotalScores(studentNumber) / studentNumber.length;
//    }
//
//    public static int displayStudentPosition(String studentName, int studentsPosition) {
//        System.out.println(studentName + " managed to get into position " + studentsPosition
//                + " on the score table");
//        return studentsPosition;
//
//    }
//
//
//    public static void main(String[] args) {
//        numberOfStudents();
//
//    }
//}