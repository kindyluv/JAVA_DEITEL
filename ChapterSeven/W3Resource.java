package ChapterSeven;

import java.util.Arrays;

public class W3Resource {

    public static void sortArray() {
        int[] array = {5, 6, 3, 2, 8, 1, 0};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumArray() {
        int[] array = {5, 6, 3, 2, 8, 1, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        ;
    }

    public static void averageSum() {
        int[] array = {5, 6, 3, 2, 8, 1, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println(average);
    }

    public static void isInArray() {
        int numberToTest = 5;
        int[] array = {1, 6, 5, 3, 2, 8, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (numberToTest == array[i]) {
                System.out.println(true);
                break;
            }
        }
    }

    public static void arrayIndex() {
        int element = 5;
        int[] array = {1, 6, 5, 3, 2, 8, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void specificArrayElement() {
        int number = 5;
        int[] array = {1, 6, 5, 3, 2, 8, 1, 0};
        int[] arrays = new int[7];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i];
            if (number == array[i]) {
                continue;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }

    public static void iteratingArray() {
        int[] array1 = {1, 6, 5, 3, 2, 8, 1};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void specificPosition() {
        int[] array1 = {1, 6, 5, 3, 2, 8, 1};
//        for (int i = 0; i < array1.length; i++) {
        array1[0] = 2;
        array1[1] = 8;
        array1[4] = 5;
//        }
        System.out.println(Arrays.toString(array1));
    }

    public static void maximumAndMinimum() {
        int[] array = {2, 8, 5, 3, 5, 8, 1};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("the minimum number is equal to: " + array[0]);
        System.out.println("the maximum number is equal to: " + array[array.length - 1]);
    }

//    public static void main(String[] args) {
//        sortArray();
//        sumArray();
//        averageSum();
//        isInArray();
//        arrayIndex();
//    specificArrayElement();
//        iteratingArray();
//        specificPosition();
//        maximumAndMinimum();
//    }
}
