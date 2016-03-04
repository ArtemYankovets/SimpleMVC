package ua.borman.mvc;

/**
 * Created by Artem on 02.03.2016.
 */
public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorModel theModel = new CalculatorModel();
        CalculatorView theView = new CalculatorView();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
