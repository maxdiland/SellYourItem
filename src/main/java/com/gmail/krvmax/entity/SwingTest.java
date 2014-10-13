package com.gmail.krvmax.entity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * author: Maxim Diland
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My first visible app");
        jFrame.setSize(200, 50);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("HELLO WORLD!!!");
        label.setSize(50,50);

        jFrame.add(label);

        jFrame.setVisible(true);
    }

}
