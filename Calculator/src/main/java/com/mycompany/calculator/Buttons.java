package com.mycompany.calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Buttons extends JPanel {

    JButton[] arrayBotones;

    public Buttons() {
        arrayBotones = new JButton[16];
        initComponents();
    }

    public JButton[] getArrayBotones() {
        return arrayBotones;
    }

    private void createButtons() {
        for (int i = 0; i < 10; i++) {
            arrayBotones[i] = new JButton(Integer.toString(i));
            arrayBotones[i].setBackground(new Color(127, 255, 212));
        }
        arrayBotones[10] = new JButton("+");
        arrayBotones[11] = new JButton("-");
        arrayBotones[12] = new JButton("*");
        arrayBotones[13] = new JButton("/");
        arrayBotones[14] = new JButton("=");
        arrayBotones[15] = new JButton("C");
        for (int i = 10; i < 16; i++) {
            arrayBotones[i].setBackground(new Color(252, 15, 192));
        }
    }

    private void initComponents() {
        createButtons();
        this.setLayout(new GridLayout(4, 4));
        this.setPreferredSize(new Dimension(300, 300));

        for (JButton tmp : arrayBotones) {
            this.add(tmp);
        }
    }
}
