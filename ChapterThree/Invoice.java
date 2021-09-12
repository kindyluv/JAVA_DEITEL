package ChapterThree;

import java.util.Scanner;

public class Invoice {
private String partNumber;
private String partDescription;
private int quantityOfItem;
private double pricePerItem;


public Invoice (String hardwareNum, String hardwareDes, int quantity,double price){
    partNumber = hardwareNum;
    partDescription = hardwareDes;
    if (quantityOfItem <= 0){ quantityOfItem = 0;}else {quantityOfItem = quantity;}
    if (pricePerItem <= 0){ pricePerItem = 0; }else {pricePerItem = price;}
}
public void setPartNumber(String hardwareNum){
        partNumber = hardwareNum;
}
public String getPartNumber(){
    return partNumber;
}
public void setPartDescription(String hardwareDes){
    if (partDescription == "hpLaptop"){partDescription = "hpLaptop";
    }else
    partDescription = hardwareDes;
}
public String getPartDescription(){
    return partDescription;
}
public void setQuantityOfItem(int quantity){
    if (quantityOfItem <= 0){ quantityOfItem = 0;
    }else
    quantityOfItem = quantity;
}
public int getQuantityOfItem(){
    return quantityOfItem;
}
public void setPricePerItem(double price){
    if (pricePerItem <= 0){
        pricePerItem = 0;
    }else
    pricePerItem = price;
}
public double getPricePerItem(){
    return pricePerItem;
}
public double getInvoiceAmount(){
    return quantityOfItem * pricePerItem;
}






}
