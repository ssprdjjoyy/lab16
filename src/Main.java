package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main(String s) {
        super(s);
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawLine(50, 150, 200, 150);
        g.drawLine(200, 150, 200, 300);
        g.drawLine(200, 300, 50, 300);
        g.drawLine(50, 300, 50, 150);
        g.drawLine(75, 200, 125, 200);
        g.drawLine(125, 200, 125, 250);
        g.drawLine(125, 250, 75, 250);
        g.drawLine(75, 250, 75, 200);
        g.drawLine(150, 100, 150, 75);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);
        g.drawLine(25, 300, 425, 300);
        g.drawOval(300, 85, 130, 150);
        g.drawLine(360, 235, 360, 300);
        g.drawLine(370, 235, 370, 300);
    }

    public static void main(String[] args) {
        new Main("Домик");
    }
}