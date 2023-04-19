package org.confetti;

import org.confetti.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create the confetti panel
        ConfettiPanel confettiPanel = new ConfettiPanel(800, 600);

        // Create some confetti
        ArrayList<Confetti> confetti = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            confetti.add(new Confetti(
                    ConfettiType.RECTANGLE,
                    ConfettiColor.randomColor(),
                    ConfettiSize.randomSize(),
                    new Point(random.nextInt(800), random.nextInt(600)),
                    ConfettiShapeFactory.createRandomShape()
            ));
        }

        // Add the confetti to the panel
        for (Confetti c : confetti) {
            confettiPanel.addConfetti(c);
        }

        // Create the frame
        JFrame frame = new JFrame("Confetti Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setContentPane(confettiPanel);
        frame.setVisible(true);

        // Start the confetti animation
        confettiPanel.startConfetti();
    }
}
