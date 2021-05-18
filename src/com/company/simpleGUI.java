package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.*;

public class simpleGUI extends JFrame {
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button10 = new JButton("10");
    private JButton button11 = new JButton("11");
    private JButton button12 = new JButton("12");
    private JButton button13 = new JButton("13");
    private JButton button14 = new JButton("14");
    private JButton button15 = new JButton("15");

    public simpleGUI(){
        super("Butt15");
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,4,10,10));
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(button10);
        container.add(button11);
        container.add(button12);
        container.add(button13);
        container.add(button14);
        container.add(button15);
    }
}
