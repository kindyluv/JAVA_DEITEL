 package ChapterSeven;

 import java.util.Scanner;

 public class ArrayMaxAndMin {
//
//    public static int sumNumberof(int[] input){
//        int sum = 0;
//        for (int i = 0; i < input.length; i++){
//            sum += i;
//        }
//        return sum;
//    }
//
//    public static int maximumNumber(int[] input){
//        int [] A = new int[0];
//        int max = A[0];
//       // int max = Integer.max(max,A[0]);
//        for (int i = 0; i < input.length; i++){
//            for (int j = 0; j < input.length; j++){
//                if (max < input[i]);
//            }
//            System.out.println(input[i]);
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of scores to be stored");
//        int input = scanner.nextInt();
//        int [] A = new int[0];
//        System.out.println("Enter scores");
//        maximumNumber(input[i]);
//        sumNumberof();
//    }
    public static int xOf() {
        int x = 30;
        int[] numb = new int[x];
        x = 60;
//    int[] A = {2,3,4,5,5,2,5};
//    int max = A[0];
//    int maxIndex = 0;
//    for (int i = 1; i < A.length; i++) {
//        if (max < A[i]) {
//            max = A[i];
//        maxIndex = i;
//    }
        System.out.println(x);
        System.out.println(numb.length);
//       // System.out.println(max /*maxIndex*/);
//    }
    return x;
    }


     public static void main(String[] args) {
        xOf();

        double[] r = {100};
        r[1] = 100;
        for (int i = 0; i < r.length; i++){
            r[i] = Math.random() * 100;
            System.out.println(r);
        }
     }
 }
