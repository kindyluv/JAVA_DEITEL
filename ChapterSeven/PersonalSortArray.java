package ChapterSeven;
import java.util.Arrays;
public class PersonalSortArray {

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


    public static void main(String[] args) {
        sortArray();
    }
}
