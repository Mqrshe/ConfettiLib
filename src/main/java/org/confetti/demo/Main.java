package org.confetti.demo;

import org.confetti.ConfettiConfig;
import org.confetti.ConfettiPanel;
import org.confetti.ConfettiSize;
import org.confetti.ConfettiColor;
import org.confetti.ConfettiShape;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Main {

    public static void main(String[] args) {
        ConfettiConfig config = new ConfettiConfig(ConfettiShape.SQUARE, ConfettiSize.MEDIUM,
                ConfettiColor.RAINBOW, 5, 90, 0.5f, 0, 50);
        ConfettiPanel confettiPanel = new ConfettiPanel(config);

        JFrame frame = new JFrame();
        frame.getContentPane().add(confettiPanel);
        frame.pack();
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
