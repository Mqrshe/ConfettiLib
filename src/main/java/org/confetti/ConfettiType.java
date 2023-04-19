package org.confetti;

import java.awt.Color;
import java.util.Random;

public enum ConfettiType {
    CIRCLE(Color.RED, 10, 5, 100, 1, 0, 360),
    SQUARE(Color.GREEN, 15, 8, 150, 0, 0, 0),
    TRIANGLE(Color.BLUE, 20, 10, 200, 2, 0, 360);

    private final Color color;
    private final int size;
    private final int speed;
    private final int life;
    private final int shape;
    private final int direction;
    private final int spread;

    private final Random random = new Random();

    ConfettiType(Color color, int size, int speed, int life, int shape, int direction, int spread) {
        this.color = color;
        this.size = size;
        this.speed = speed;
        this.life = life;
        this.shape = shape;
        this.direction = direction;
        this.spread = spread;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLife() {
        return life;
    }

    public int getShape() {
        return shape;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpread() {
        return spread;
    }

    public int getRandomDirection() {
        return random.nextInt(direction);
    }

    public int getRandomSpread() {
        return random.nextInt(spread);
    }
}
