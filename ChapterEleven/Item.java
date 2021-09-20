package ChapterEleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Item {
    private final String name;
    private final float price;
    private final int quantity;
    private final ArrayList<String> arrayList = new ArrayList<>();

    public Item(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public float calculateTotal(){
        return this.price * this.quantity;
    }

    public String toString(){
        return this.name + "\t\t\t" + this.price + "\t\t" + this.quantity + "\t\t" + this.calculateTotal();
    }

}
