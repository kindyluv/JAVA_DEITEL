package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static final Scanner scanner = new Scanner(System.in);
    private static String name = scanner.next();
    private static int user = scanner.nextInt();
    private static int[] input = new int[user];
    private static int userInput = scanner.nextInt();

    static int[] getNumber(){
        System.out.print("Enter number of counts: ");
        int input = scanner.nextInt();
        int[] inputs = new int[input];
        for (int i = 0; i < inputs.length; i++) {
            System.out.print("Enter Number:  ");
            inputs[i] = scanner.nextInt();
        }
        return inputs;
    }

    public static int[] reverseNumber(int[] inputs){
        int[] reversedInput = new int[inputs.length];
        for (int i = inputs.length - 1; i >= 0;) {
            for (int j = 0; j < inputs.length; j++) {
                reversedInput[j] = inputs[i];
                i--;
            }
        }
        return reversedInput;
    }

    public static String[] getName(){
        System.out.println("Enter Name:  ");
        String[] name = new String[0];
        return name;
    }

    public static String[] reverseName(String[] name){
        String[] names = new String[name.length];
        for (int i = name.length; i > 0; i--){
//            for (int j = 0; j < name.length; j++){
                names[i] = scanner.next();
            //}
        }
        return names;
    }

    public static void main(String[] args) {
        reverseName(getName());
        //System.out.println(Arrays.toString(reverseNumber(getNumber())));
    }
}
