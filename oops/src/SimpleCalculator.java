public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult(){
        double result = firstNumber+ secondNumber;
        return result;
    }
    public double getSubtractionResult(){
        double result = firstNumber- secondNumber;
        return result;
    }
    public double getMultiplicationResult(){
        double result = firstNumber* secondNumber;
        return result;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        else {
            double result = firstNumber / secondNumber;
            return result;
        }
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber(){
        return firstNumber;
    }
}
