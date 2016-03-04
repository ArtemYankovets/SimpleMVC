package ua.borman.mvc;

/**
 * Created by Artem on 02.03.2016.
 */
public class CalculatorModel {

    private int calcValue;

    public int getCalcValue() {
        return calcValue;
    }

    public void addTwoNumbers(int firstNum, int secondNum){
        calcValue = firstNum + secondNum;
    }
}
