package ua.borman.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Artem on 02.03.2016.
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theModel = theModel;
        this.theView = theView;

        this.theView.addCalcListner(new CalcListener());
    }

    private class CalcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum, secondNum = 0;

            try {
                firstNum = theView.getFirstNum();
                secondNum = theView.getSecondNum();

                theModel.addTwoNumbers(firstNum, secondNum);
                theView.setCalcSolution(theModel.getCalcValue());
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need enter 2 Integers");
            }
        }
    }
}
