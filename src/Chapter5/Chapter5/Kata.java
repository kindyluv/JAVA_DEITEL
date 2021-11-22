package Chapter5.Chapter5;

import java.util.Scanner;

public class Kata {


    int counter = 1;
    int number = 1;
    int driller = 1;
    int result = 1;


    public int calculateFactorsOf(int kat) {
        while (counter <= 5) {

            result = result * counter;

            counter++;
        }
        return result;

    }


    public int calculateSquareOf(int i) {
        return i * i;
    }

    public int calculateTestDrillerOf(int order) {
        if (order >= 1 && order <= 4) {
            result = 1500 * order;
        }
        if (order >= 1 && order <= 4) {
            result = 1500 * order;
        }
            return result;
    }

}


