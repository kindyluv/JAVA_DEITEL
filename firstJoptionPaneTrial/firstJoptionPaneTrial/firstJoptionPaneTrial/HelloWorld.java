package firstJoptionPaneTrial;

import javax.swing.*;

public class HelloWorld {

    public void sayHello(){
        JOptionPane.showMessageDialog(null,"Hello World!","Love",JOptionPane.INFORMATION_MESSAGE);
    }

    public void sayHi(){
        JOptionPane.showInputDialog(null,"Saying Hi To The World", "Love");
    }

//    public void sayGreetings(){
//        JOptionPane.showConfirmDialog(null, "Welcome", "FullStack",JOptionPane.YES_NO_OPTION);
//    }
//
//    public void enterAnInteger(){
//        JOptionPane.showInputDialog(null, "Enter an integer: ", "Input");
//    }
//
//    public void enterAnIntegerNumber(){
//        String number = JOptionPane.showInputDialog(null, "Enter an integer");
//        int numb = Integer.parseInt(number);
//        System.out.println("You entered " + numb + ".");
//    }
//
//    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.sayHello();
//        helloWorld.sayHi();
//        helloWorld.sayGreetings();
//        helloWorld.enterAnInteger();
//        helloWorld.enterAnIntegerNumber();
//    }
}
