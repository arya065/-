package com.mycompany.calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TestClass {

    public static void main(String[] args) {

        JFrame frame = new JFrame("test buttons");
        Calculator calculator = new Calculator();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setPreferredSize(new Dimension(500,600));
//        frame.setSize(500, 600);

        frame.add(calculator);
        
        frame.setResizable(false);
        frame.pack();// вроде как делает размер окна таким же как и в calculator
    }
}
