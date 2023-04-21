package org.confetti;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.git


public class ConfettiPanel extends JPanel {

    private List<Confetti> confettiList;
    private ConfettiConfig confettiConfig;
    private Random random;

    public ConfettiPanel(int width, int height, ConfettiConfig confettiConfig) {
        super();
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.WHITE);
        this.confettiList = new ArrayList<>();
        this.confettiConfig = confettiConfig;
        this.random = new Random();
    }

    public void addConfetti(Confetti confetti) {
        confettiList.add(confetti);
    }

    public void updateConfetti() {
        List<Confetti> confettiToRemove = new ArrayList<>();
        for (Confetti confetti : confettiList) {
            if (confetti.getY() >= this.getHeight()) {
                confettiToRemove.add(confetti);
            } else {
                confetti.update();
            }
        }
        confettiList.removeAll(confettiToRemove);
        int numOfConfettiToAdd = random.nextInt(confettiConfig.getMaxConfettiToAdd() + 1 - confettiConfig.getMinConfettiToAdd()) + confettiConfig.getMinConfettiToAdd();
        for (int i = 0; i < numOfConfettiToAdd; i++) {
            Confetti confetti = confettiConfig.getConfettiFactory().createConfetti(random.nextInt(getWidth()), -confettiConfig.getMinConfettiSize().getValue(), confettiConfig);
            confettiList.add(confetti);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Confetti confetti : confettiList) {
            confetti.draw((Graphics2D) g);
        }
    }
}
