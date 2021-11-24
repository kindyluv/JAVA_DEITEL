package printerProject.src.printer;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.Sides;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SemiColonPrinter {
    private static FileInputStream textStream;
    private static DocFlavor docFlavor;
    private static  PrintRequestAttributeSet aset;
    private static Doc doc;

    public static void main(String[] args) throws PrintException, FileNotFoundException {
        SemiColonPrinter printer = new SemiColonPrinter();
        printer.inputFile("git token.txt");
        printer.setDocumentType();
        printer.discoverPrinter();

    }

    public FileInputStream inputFile(String fileName) throws FileNotFoundException {
        try {
           return textStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(textStream  == null){
            System.out.println("printer not found ");
        }
        return null;
    }

    public void setDocumentType(){
        docFlavor = DocFlavor.INPUT_STREAM.TEXT_PLAIN_US_ASCII;
        Doc doc = new SimpleDoc(textStream, docFlavor, null);
        aset = new HashPrintRequestAttributeSet();
        aset.add(new Copies(5));
        aset.add(MediaSize.ISO.A4);
        aset.add(Sides.DUPLEX);
    }

    public void discoverPrinter() throws PrintException {
        PrintService[] services = PrintServiceLookup.lookupPrintServices(docFlavor, aset);
        if(services.length > 0){
            DocPrintJob job = services[0].createPrintJob();
            try{
                job.print(doc, aset);
            }catch(PrintException e){
                e.printStackTrace();
            }
        }
    }


}
