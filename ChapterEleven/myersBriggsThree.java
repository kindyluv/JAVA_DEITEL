package ChapterEleven;

import java.util.Arrays;
import java.util.Scanner;

public class myersBriggsThree {
 public static String[] array;
 public static char[] userResponses;

    public static String[] questions() {
    String[] question = {

     """
     1 a. expend energy enjoy groups                           b. conserve energy, enjoy one-on-one""",
     """
     2 a. interpret literally                                  b. look for meaning and possibilities""",
     """
     3 a. logical, thinking, questioning,                      b. empathetic, feeling, accommodating""",
    """
     4 a. organized, orderly                                   b. flexible, adaptable""",
     """
     5 a. more outgoing, think out loud                        b. more reserved, think to yourself""",
    """
     6 a. practical, realistic, experiential                   b. imaginative, innovative, theoretical""",
     """ 
     7 a. candid, straight forward, frank                      b. tactful, kind, encouraging""",
     """
     8 a. plan, schedule                                       b. unplanned spontaneous""",
     """
     9 a. seek many tasks public activities, interaction with  b. seek private, solitary activities with quiet
      others                                                      to concentrate""",
     """
     10 a. standard, usual, conventional                       b. different, novel, unique""",
     """
     11 a. firm, tend to criticize, hold the line              b. gentle, tend to appreciate, conciliate""",
     """
     12 a. regulated, structured                               b. easygoing, 'live and let live'""",
     """
     13 a. external, communicative, express yourself           b. internal, reticent, keep to yourself""",
     """
     14 a. focus on here-and-now                               b. look to the future, global perspective,'big picture'""",
     """
     15 a. tough-minded, just                                  b. tender-hearted, merciful""",
     """
     16 a. preparation, plan ahead                             b. go with the flow, "adapt as you go""",
     """
     17 a. active, initiate                                    b. reflective, deliberate""",
     """
     18 a. facts, things, 'what is                             b. what could be', philosophical""",
     """
     19 a. matter of fact, issue-oriented		               b.  sensitive, people-oriented, compassionate""",
     """
     20 a. control, govern                                     b. latitude, freedom""",
     };
    return question;
    }

    public static void answer(){
        array = questions();
        Scanner scanner = new Scanner(System.in);
        userResponses = new char[array.length];
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);

                userResponses[i] = scanner.next().charAt(0);

            }
        }

    public static void displayResult(){

        String table =String.format("%6s%6s%6s", " ","A","B");
        System.out.println(table.repeat(4));
        System.out.println("=".repeat(80));
        for (int i = 1; i < array.length; i+=4) {
            System.out.printf("%6d", i);
            if (userResponses[i - 1] == 'A' || userResponses[i - 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            }else{
                System.out.printf("%6s%6s", " ","B");
            }
            System.out.printf("%6d", i + 1);
            if (userResponses[i] == 'A' || userResponses[i] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            }else{
                System.out.printf("%6s%6s", " ","B");
            }
            System.out.printf("%6d", i + 2);
            if (userResponses[i + 1] == 'A' || userResponses[i + 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            }else{
                System.out.printf("%6s%6s", " ","B");
            }
            System.out.printf("%6d", i + 3);
            if (userResponses[i + 2] == 'A' || userResponses[i + 2] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            }else{
                System.out.printf("%6s%6s", " ","B");
            }
            System.out.println();
        }
    }

    public static void getTotalResponse(){
        String [] personalityResult = new String[4];
        System.out.println("=".repeat(80));
        System.out.printf("%6s", "Total");
        int countA;
        int countB;
        for (int i = 0; i < 4; i++) {
            countA = 0;
            countB = 0;
            if (userResponses[i] == 'a' || userResponses[i] == 'A'){
                countA++;
            }else {
                countB++;
            }
            if (userResponses[i+4] == 'a' || userResponses[i+4] == 'A'){
                 countA++;
            }else {
                countB++;
            }
            if (userResponses[i+8] == 'a'|| userResponses[i+8] == 'A'){
                countA++;
            }else {
                countB++;
            }
            if (userResponses[i+12] == 'a' || userResponses[i+12] == 'A'){
                countA++;
            }else {
                countB++;
            }
            if (userResponses[i+16] == 'a' || userResponses[i+16] == 'A'){
                countA++;
            }else {
                countB++;
            }
            System.out.printf("%6d%6d%6s", countA, countB, " ");

            switch (i){

                case 0 -> {
                    if (countA > countB){
                        personalityResult[i] = "Extrovert";
                    }else{
                        personalityResult[i] = "Introvert";
                    }
                }
                case 1-> {
                    if (countA > countB){
                        personalityResult[i] = "sensing";
                    }else {
                        personalityResult[i] = "intuition";
                    }
                }
                case 2-> {
                    if (countA > countB) {
                        personalityResult[i] = "thinking";
                    }else {
                        personalityResult[i] = "feeling";
                    }
                }
                case 3-> {
                    if (countA > countB){
                        personalityResult[i] = "judging";
                    }else{
                        personalityResult[i] = "perspective";
                    }
                }
            }
        }
        System.out.println("\n" + Arrays.toString(userResponses));
            System.out.print(Arrays.toString(personalityResult));

    }

    public static void main(String[] args) {
        answer();
        displayResult();
        getTotalResponse();
    }
}
