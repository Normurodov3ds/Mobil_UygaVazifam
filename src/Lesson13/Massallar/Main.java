package Lesson13.Massallar;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class GeometricShape extends JPanel {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new GeometricShape());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(450, 450);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

        int i = 0;
        while (true) {
            g.drawLine(0, 0, i, i+10);
            g.setColor(Color.green);
            i++;
        }

    }
}