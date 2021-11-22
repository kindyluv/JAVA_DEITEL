package ChapterFour;

import java.util.Scanner;

public class ClassAverage {

  public static void  main(String[] args) {

      Scanner input = new Scanner(System.in);
      int total = 0;
      int gradeCounter = 0;
      System.out.println("Enter grade or -1 to stop");
      int grade = input.nextInt();

      while (gradeCounter != -1){
      total = total + grade;
      gradeCounter = gradeCounter + 1;
          System.out.println("Enter grade or -1 to stop");
          grade = input.nextInt();
      }
      if (gradeCounter != 0){
          System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
      }else
      System.out.println("Empty");
  }
 }
