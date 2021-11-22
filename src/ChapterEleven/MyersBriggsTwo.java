package ChapterEleven;

import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggsTwo {
    private static final int row = 20;
    private static final int column = 2;
    private static Scanner scanner = new Scanner(System.in);
    private static String[] answers = new String[20];
    private static String[][] arrayAnswer = new String[row][column];
    private static final String[][] arrayQuestion = {{"Null","Null"},{"expend energy enjoy groups","conserve energy," +
    "enjoy one-on-one"},{"interpret literally","look for meaning and possibilities"},{"logical, thinking, " +
    "questioning","empathetic, feeling, accommodating"},{"organized, orderly","flexible, adaptable"},
    {"more outgoing, think out loud","more reserved, think to yourself"},{"practical, realistic, experiential",
    "imaginative, innovative, theoretical"},{"candid, straight forward, frank","tactful, kind, encouraging"},
    {"plan, schedule","unplanned spontaneous"},{"seek many tasks, public activities, interaction with others",
    "seek private, solitary activities with quiet to concentrate"},{"standard, usual, conventional",
    "different, novel, unique"},{"firm, tend to criticize, hold the line","gentle, tend to appreciate, conciliate"},
    {"regulated, structured","easygoing, 'live and let live'"},{"external, communicative, express yourself",
    "internal, reticent, keep to yourself"},{"focus on here-and-now","look to the future, global perspective, " +
    "'big picture'"},{"tough-minded, just","tender-hearted, merciful"},{"preparation, plan ahead","go with the flow," +
    "adapt as you go"},{"active, initiate","reflective, deliberate"},{"facts, things, 'what is'","ideas, dreams, " +
    "'what could be', philosophical"},{"matter of fact, issue-oriented","sensitive, people-oriented, compassionate"},
    {"control, govern","latitude, freedom"}};


    public static String[][] myersBriggs(){
        System.out.println("Enter answer:  ");
        String user = scanner.next();
        for (int i = 1; i < arrayQuestion.length; i +=4){
             for (int j = i; j <= i; j+=3){
            System.out.print(j + " \t\t");
            arrayAnswer [i] = arrayQuestion[i];
             }
            System.out.println(Arrays.toString(arrayQuestion[i]));
        }
        return arrayAnswer;
    }

    public static void main(String[] args) {
        myersBriggs();
    }
}
