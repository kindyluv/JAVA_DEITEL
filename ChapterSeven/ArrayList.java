package PersonalFolder;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListClass {
    private static final ArrayList<String> signs = new ArrayList<>();
    private ArrayList<String> sign = new ArrayList<>();
    private static ArrayList<String> numbs = new ArrayList<>();

    public static void arrayLists(){
        numbs.add("One");
        numbs.add("Two");
        numbs.add("Four");
        numbs.add("Zero");
        numbs.add("Six");
        numbs.add("Seven");
        numbs.add("Nine");
        numbs.add("Eleven");
        numbs.add ("Ten");
        numbs.add("Eight");
        numbs.add("Five");
        numbs.add("Three");

//        System.out.println(numbs);
        numbs.add(2, "me");
//        System.out.println(numbs);
        for (int i = 0; i < numbs.size(); i++) {
            int j = numbs.indexOf(i);
            System.out.println("Item " + numbs.get(i) + " is in index "+ ": " + i);
//            System.out.println(numbs.get(i));
        }
    }

    public static void addMoreToArray(){
        numbs.add(2, "me");
//        System.out.println(numbs);
    }

    public static void iterator(){
        numbs.add(0, "Zero");
        numbs.add(1, "One");
        numbs.add(2, "Two");
        numbs.add(3, "Three");
        numbs.add(4, "Four");
        numbs.add(5, "Five");

        String num;
        Iterator<String> k = numbs.iterator();
        while (k.hasNext()){
            num = k.next();
            System.out.println(num);
        }
    }
    public static void reprint(){
        System.out.println(numbs);
    }

    public static void main(String[] args) {
//        arrayLists();
//        addMoreToArray();
//        iterator();
        reprint();
    }
}
