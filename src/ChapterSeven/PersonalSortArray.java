package ChapterSeven;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PersonalSortArray {
//    private static Scanner scanner = new Scanner(System.in);
//    private static int input = scanner.nextInt();
//    private static String inputString = scanner.next();

    public static int[] sortArray(){
        int highestNumber = 0;
        int smallestNumber = 0;
        int[] array = {3, 1, 6, 7, 2};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        highestNumber = array[array.length-1];
        int x = 2;
        smallestNumber = array[array.length - x];
        while (smallestNumber == highestNumber){
            smallestNumber = array[array.length-x];
            x++;
        }
        smallestNumber = array.length;
        highestNumber = array[4];
        System.out.println(Arrays.toString(array));
        System.out.printf("%d%n%d",smallestNumber, highestNumber);
        return array;
    }

    public static void smallestHighestNumber(){
        int temp;
//        int[] array = new int[];
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(4);
        array.add(7);
        array.add(3);
        array.add(8);
//        String addMore = "yes";
//        while (Objects.equals(addMore, "yes")) {
//            System.out.println("Enter number");
//            array.add(input);
//            System.out.println("\"yes\" to continue, \"no\" to stop");
//            addMore = inputString;
//        }

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) > array.get(j)){
                    temp = array.get(i);
                    array.add(i, array.get(j));
                    array.add(j, temp);
                }
            }
        }
        System.out.println(array);
//        System.out.println();
//        return array;
    }

    public static void main(String[] args) {
       sortArray();
//        System.out.println(smallestHighestNumber());
        smallestHighestNumber();
    }
}
