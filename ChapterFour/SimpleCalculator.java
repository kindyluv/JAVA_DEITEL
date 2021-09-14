package ChapterFour;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber() {

        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }
    public double getSecondNumber() {

        return secondNumber;
    }

    public double getAdditionResult(){
        double addition = 0;
        addition = firstNumber + secondNumber;
        return addition;
    }
    public double getSubtractionResult(){
        double subtraction = 0;
        subtraction = firstNumber - secondNumber;
        return subtraction;
    }
    public double getMultiplicationResult(){
        double multiplication = 0;
        multiplication = firstNumber * secondNumber;
        return multiplication;
    }
    public double getDivisionResult(){
        double division = 0;
        division = firstNumber / secondNumber;
        return division;
    }


}
