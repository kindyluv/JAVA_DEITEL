package ChapterThree;

import java.util.Scanner;

public class Score {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number =1;
         int total = 0;
         int count = 1;
         while(count <=10) {
             System.out.printf("Enter score %d%n", number++);
             int score = input.nextInt();
             total = total + score;
             count += 3;
         }
         double average = (double)total/count;
        System.out.printf("the total score is %d%n", total);
        System.out.printf("the average score is %f", average);

    }




}
