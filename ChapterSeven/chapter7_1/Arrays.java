package chapter7_1;

//import java.sql.Array;

import java.util.ArrayList;

public class Arrays {
    static ArrayList<Integer> array;

    public Arrays (int length){
        array = new ArrayList<>(length);
    }

    public static void add(int item){
        array.add(item);
    }

    public void insert(int index, int item){
        index = 0;
//        int start = 0;
//        int end;
//        for (int i = 0; i < lenght.size()/2; i++) {
//            start = lenght.get(i);
//        }
//        for (int i = 1 + (lenght.size()/2); i < lenght.size(); i++) {
//            end = lenght.get(i);
//        }
        while(array.size() != 0) {
            if (index == 0) {
                add(item);
            } else if (index > 0) {
                add(item);
            }
        }

    }

}


