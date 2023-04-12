package com.mycompany.calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ResultWindow extends JPanel {

    JLabel resultLabel;

    public ResultWindow() {
        initComponents();
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    private void initComponents() {
        resultLabel = new JLabel("0");
        this.setLayout(new FlowLayout());
        this.add(resultLabel);
        this.setPreferredSize(new Dimension(300,100));
//        resultLabel.setSize(200,50);
    }
}
