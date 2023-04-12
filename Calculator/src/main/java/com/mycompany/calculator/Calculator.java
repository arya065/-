package com.mycompany.calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Calculator extends JPanel implements ActionListener{

    Buttons buttons;
    ResultWindow resultWindow;

    public Calculator() {
        buttons = new Buttons();
        resultWindow = new ResultWindow();
        
        setSizes();
    }

    public void setSizes() {
        this.setLayout(new BorderLayout());

        this.add(buttons, BorderLayout.SOUTH);
        this.add(resultWindow, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(300,350));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
    }

}
