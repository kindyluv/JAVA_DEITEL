package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice record = new Invoice("AF056", "pattern", 1, 100);


    @Test
    public void invoiceCanNotTakeNegativeQuantityTest(){
    record.setPartNumber("AF056");
    record.setPartDescription("hpLaptop");
    record.setQuantityOfItem(-5);
    record.setPricePerItem(100);
    assertEquals(0, record.getQuantityOfItem());
    }
    @Test
    public void invoiceCanNotRecordNegativeInvoiceAmountTest(){
    record.setPartNumber("AF056");
    record.setPartDescription("hpLaptop");
    record.setQuantityOfItem(-10);
    record.setPricePerItem(-1000);
    assertEquals(0, record.getInvoiceAmount());
    }
    @Test
    public void invoiceCanNotTakeNegativePriceTest(){
        record.setPartNumber("AF056");
        record.setPartDescription("hpLaptop");
        record.setQuantityOfItem(20);
        record.setPricePerItem(-1000);
        assertEquals(0, record.getPricePerItem());
    }
    @Test
    public void invoiceCanNotTakeIncorrectDescriptionTest(){
        record.setPartNumber("AF056");
        record.setPartDescription("lenovo");
        record.setQuantityOfItem(20);
        record.setPricePerItem(-1000);
        assertEquals("lenovo", record.getPartDescription());
    }

}