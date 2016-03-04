package ua.borman.mvc;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.*;
/**
 * Created by Artem on 02.03.2016.
 */
public class CalculatorView extends JFrame{
    private JTextField firstNum = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNum = new JTextField(10);
    private JButton calcButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    public int getFirstNum() {
        return Integer.parseInt(firstNum.getText());
    }

    public int getSecondNum() {
        return Integer.parseInt(secondNum.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalcListner (ActionListener listenForCalcButton){
        calcButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNum);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNum);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

}
