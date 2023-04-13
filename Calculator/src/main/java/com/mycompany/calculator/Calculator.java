package com.mycompany.calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Calculator extends JPanel implements ActionListener {

    private Buttons buttons;
    private ResultWindow resultWindow;
    private int value1;
    private int value2;
    private int operator;
    private double result;

    public Calculator() {
        buttons = new Buttons();
        resultWindow = new ResultWindow();
        result = 0;
        setSizes();
        setTextLabel();
    }

    public void setSizes() {
        this.setLayout(new BorderLayout());

        this.add(buttons, BorderLayout.SOUTH);
        this.add(resultWindow, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(300, 350));
    }

    //привязка слушателя к каждой кнопке
    public void setTextLabel() {
        for (int i = 0; i < buttons.getArrayBotones().length; i++) {
            buttons.getArrayBotones()[i].addActionListener(this);
        }
    }

    //добавления слушателя, который показывает значение кнопки на панели результата
    @Override
    public void actionPerformed(ActionEvent e) {
        String previous = resultWindow.getResultLabel().getText();
        JButton aux = (JButton) e.getSource();
        if (aux.equals(buttons.getArrayBotones()[0])) {
            resultWindow.getResultLabel().setText(previous + "0");
        } else if (aux.equals(buttons.getArrayBotones()[1])) {
            resultWindow.getResultLabel().setText(previous + "1");
        } else if (aux.equals(buttons.getArrayBotones()[2])) {
            resultWindow.getResultLabel().setText(previous + "2");
        } else if (aux.equals(buttons.getArrayBotones()[3])) {
            resultWindow.getResultLabel().setText(previous + "3");
        } else if (aux.equals(buttons.getArrayBotones()[4])) {
            resultWindow.getResultLabel().setText(previous + "4");
        } else if (aux.equals(buttons.getArrayBotones()[5])) {
            resultWindow.getResultLabel().setText(previous + "5");
        } else if (aux.equals(buttons.getArrayBotones()[6])) {
            resultWindow.getResultLabel().setText(previous + "6");
        } else if (aux.equals(buttons.getArrayBotones()[7])) {
            resultWindow.getResultLabel().setText(previous + "7");
        } else if (aux.equals(buttons.getArrayBotones()[8])) {
            resultWindow.getResultLabel().setText(previous + "8");
        } else if (aux.equals(buttons.getArrayBotones()[9])) {
            resultWindow.getResultLabel().setText(previous + "9");
        } else if (aux.equals(buttons.getArrayBotones()[10])) {
            resultWindow.getResultLabel().setText("");
            value1 = Integer.parseInt(previous);
            operator = 1; //+
        } else if (aux.equals(buttons.getArrayBotones()[11])) {
            resultWindow.getResultLabel().setText("");
            value1 = Integer.parseInt(previous);
            operator = 2; //-
        } else if (aux.equals(buttons.getArrayBotones()[12])) {
            resultWindow.getResultLabel().setText("");
            value1 = Integer.parseInt(previous);
            operator = 3; // *
        } else if (aux.equals(buttons.getArrayBotones()[13])) {
            resultWindow.getResultLabel().setText("");
            value1 = Integer.parseInt(previous);
            operator = 4; // /
        } else if (aux.equals(buttons.getArrayBotones()[14])) {
            value2 = Integer.parseInt(previous);
            double value3 = calculateResult();
            resultWindow.getResultLabel().setText(Double.toString(value3));

        } else if (aux.equals(buttons.getArrayBotones()[15])) {
            resultWindow.getResultLabel().setText("");
        }

    }

    // соединяет всё вместе
    public double calculateResult() {

        if (operator == 1) {
            return value1 + value2;
        } else if (operator == 2) {
            return value1 - value2;
        } else if (operator == 3) {
            return value1 * value2;
        } else if (operator == 4) {
            return value1 / value2;
        }
        return result;
    }
}
