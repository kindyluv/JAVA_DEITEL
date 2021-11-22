package ChapterFour;

public class SimpleCalculatorMain {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        double addition = calculator.getAdditionResult();
        System.out.println("Add = " + addition);
        double subtraction = calculator.getSubtractionResult();
        System.out.println("subtract = " + subtraction);
        double multiply = calculator.getMultiplicationResult();
        System.out.println("multiply = " + multiply);
        double division = calculator.getDivisionResult();
        System.out.println("division = " + division);
    }
}
