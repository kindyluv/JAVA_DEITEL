package ChapterEleven;

import java.util.ArrayList;

public class Cart {
    private String customerName;
    private static final ArrayList<Item> items = new ArrayList<>();

    public Cart(String customerName){
        this.customerName = customerName;
    }

    public void addItemToCart(Item item){
        items.add(item);
    }

    public int calculateTotalPrice(){
        int total = 0;
        for (Item item : items) {
            total += item.calculateTotal();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder stringToReturn = new StringBuilder();
        for (Item item: items){
            stringToReturn.append(item.toString()).append("\n");
        }
        return stringToReturn.toString();
    }
    public double calculateVatOf(double percentage){
        return this.calculateTotalPrice() * (percentage / 100.0);
    }
}
