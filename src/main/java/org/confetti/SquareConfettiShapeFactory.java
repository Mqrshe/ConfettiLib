package org.confetti;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class SquareConfettiShapeFactory extends ConfettiShapeFactory {

    private final Random random = new Random();

    @Override
    public Shape createShape(float size) {
        float width = size * random.nextFloat() * 2;
        float height = size * random.nextFloat() * 2;
        return new Rectangle2D.Float(-width / 2, -height / 2, width, height);
    }

    @Override
    public Confetti createConfetti(float x, float y, float size, float dx, float dy, ConfettiColor color) {
        return null;
    }
}
