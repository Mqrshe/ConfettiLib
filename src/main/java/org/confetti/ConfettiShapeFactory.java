package org.confetti;

import java.awt.Shape;
import java.util.Random;

public abstract class ConfettiShapeFactory {

    public static Shape createShape(ConfettiShape shape, double size) {
        switch (shape) {
            case SQUARE:
                return new java.awt.geom.Rectangle2D.Double(0, 0, size, size);
            case CIRCLE:
                return new java.awt.geom.Ellipse2D.Double(0, 0, size, size);
            case TRIANGLE:
                java.awt.geom.Path2D.Double path = new java.awt.geom.Path2D.Double();
                double halfSize = size / 2;
                path.moveTo(0, size);
                path.lineTo(halfSize, 0);
                path.lineTo(size, size);
                path.closePath();
                return path;
            default:
                throw new IllegalArgumentException("Unknown confetti shape: " + shape.getName());
        }
    }

    public abstract Shape createShape(float size);

    public abstract Confetti createConfetti(float x, float y, float size, float dx, float dy, ConfettiColor color);

    public static ConfettiShapeFactory getFactory(ConfettiShape shape) {
        switch (shape) {
            case SQUARE:
                return new SquareConfettiShapeFactory();
            case CIRCLE:
                return new CircleConfettiShapeFactory();
            case TRIANGLE:
                return new TriangleConfettiShapeFactory();
            default:
                throw new IllegalArgumentException("Unknown confetti shape: " + shape.getName());
        }
    }

    protected float getRandomFloat(Random random, float min, float max) {
        return min + random.nextFloat() * (max - min);
    }
}
