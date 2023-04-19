package org.confetti;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class CircleConfettiShapeFactory extends ConfettiShapeFactory {

    private final Random random = new Random();

    @Override
    public Shape createShape(float size) {
        float diameter = size * random.nextFloat() * 2;
        return new Ellipse2D.Float(-diameter / 2, -diameter / 2, diameter, diameter);
    }

    @Override
    public Confetti createConfetti(float x, float y, float size, float dx, float dy, ConfettiColor color) {
        return null;
    }

}
