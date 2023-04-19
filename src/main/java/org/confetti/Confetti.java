package org.confetti;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Confetti {

    private int x;
    private int y;
    private int size;
    private double xSpeed;
    private double ySpeed;
    private Color color;

    public Confetti(int x, int y, int size, double xSpeed, double ySpeed, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = color;
    }

    public void move(Rectangle bounds) {
        x += xSpeed;
        y += ySpeed;

        if (x < bounds.x || x + size > bounds.x + bounds.width) {
            xSpeed = -xSpeed;
        }

        if (y + size > bounds.y + bounds.height) {
            y = bounds.y + bounds.height - size;
            ySpeed = 0;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillRect(x, y, size, size);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Color getColor() {
        return color;
    }
}
