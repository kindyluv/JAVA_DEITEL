package ChapterEleven;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class MainCustomerInvoice {
    private static Scanner scanner = new Scanner(System.in);
    private static String name;
    private static Cart cart = new Cart("Default");


    public static String customerNameSetUpCart(){
        System.out.println("What is the customer's name:");
        name = scanner.next();
        cart = new Cart(name);
        return name;
    }

    public static void addItemsToCart() {
        System.out.println("What item did " + name + " purchased");
        String itemName = scanner.next();
        System.out.println("How much does the " + itemName + " cost");
        float itemPrice = scanner.nextFloat();
        System.out.println("How many " + itemName + " did " + name + " buy");
        int itemQuantity = scanner.nextInt();
        Item currentItemList = new Item(itemName , itemPrice   ,   itemQuantity);
        cart.addItemToCart(currentItemList);
    }

    public static void addMoreItem(){
        String addMoreItems = "yes";
        while (Objects.equals(addMoreItems, "yes")){
            addItemsToCart();
            System.out.println("Anything else ?");
            addMoreItems = scanner.next().toLowerCase();
        }
    }

    public static void displayInvoice(){
        System.out.println(cart);
        System.out.println(cart.calculateTotalPrice());
        System.out.println("The vat is " + cart.calculateVatOf(7.5F));
    }

    public static void main(String[] args) {
        customerNameSetUpCart();
//        addItemsToCart();
        addMoreItem();
        displayInvoice();

    }
}
