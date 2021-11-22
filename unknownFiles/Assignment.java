package Chapter5.unknownFiles;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {

//    public static void main(String[] args) {
//        System.out.println("Enter number of scores to store");
//        Scanner input = new Scanner(System.in);
//        int inputScore = input.nextInt();
//        int[] score = new int[inputScore];
//        for (int i =0; i < score.length; i++){
//            System.out.println("Enter scores: " + (i+1));
//            score[i] = input.nextInt();
//        }
//
//        System.out.println("The smallest value is: " + uncleChiBobArray(score));
//        System.out.println("The largest value is: " + uncleChiBobArrays(score));
//       // System.out.println("The total value is: " + calculateTotalValuesOf(score));
//       // System.out.println("The average value is: " + calculateAverageValuesOf(score) + "\n");
//
//        for (int j : score) {
//            System.out.println("The students scores is: " + j);
//        }
//    }
public static void main(String[] args) {

    System.out.println("Enter number of scores to store");
    Scanner input = new Scanner(System.in);
    int inputScore = input.nextInt();
    int[] score = new int[inputScore];
    for (int i =0; i < score.length; i++) {
        System.out.println("Enter scores: " + (i + 1));
        score[i] = input.nextInt();
    }
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(calculateTheArrayOfSubtractedSum(score)));
        System.out.println(largestValueOf(score));
        System.out.println(smallestValueOf(score));
        System.out.println(calculateTheSumOf(score));
        //System.out.println(uncleChiBobArrays());
    }


    public static int calculateTheSumOf(int... score){
        int sum = 0;
        for (int j : score) {
            sum += j;
        }
        return sum;
    }

    public static int[] calculateTheArrayOfSubtractedSum(int... score){
        //int[] firstNumber = ;
        int total = calculateTheSumOf(score);
        int[] subtractedArray = new int[score.length];
        for (int i = 0; i < subtractedArray.length;){
            for (int j: score){
                int number = total - j;
                subtractedArray[i] = number;
                i++;
            }
        }
        return subtractedArray;
    }

    public static int largestValueOf(int... score){
        int[] largeArray = calculateTheArrayOfSubtractedSum(score);
        int largestArray = largeArray[0];
        for (int j : largeArray) {
            if (largestArray < j) {
                largestArray = j;
            }
        }
        return largestArray;
    }

    public static int smallestValueOf(int...score){
        int[] smallArray = calculateTheArrayOfSubtractedSum(score);
        int smallestArray = smallArray[0];
        for (int j : smallArray) {
            if (smallestArray > j) {
                smallestArray = j;
            }
        }
        return smallestArray;
    }





//
//    int[] random = {2, 3, 4, 5, 6};
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int rand = scanner.nextInt();
//        int[] random = new int[rand];
//        //     System.out.println(randomPicking(random));
//    }
//
//    public static int calculateSumOf(int[] random) {
//        int number = random[0];
//        for (int i = 0; i < random.length; i++) {
//            number = number + random[i];
//        }
//        return number;
//    }
//
//    public static int calculateLengthOf(int[] random) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter " + random.length + "values");
//        for (int i = 0; i < random.length; i++) {
//
//            int[] array = new int[i];
//        }
//    }
////    int[] precious = new int[10];
////    int[] presh = {1,2,3,4,5,6,7,8,9,3};
//}
}
