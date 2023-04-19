package org.confetti;

import java.awt.Shape;
import java.awt.geom.Path2D;

public class TriangleConfettiShapeFactory extends ConfettiShapeFactory {

    @Override
    public Shape createShape(float size) {
        Path2D.Double path = new Path2D.Double();
        double halfSize = size / 2;
        path.moveTo(0, size);
        path.lineTo(halfSize, 0);
        path.lineTo(size, size);
        path.closePath();
        return path;
    }

    @Override
    public Confetti createConfetti(float x, float y, float size, float dx, float dy, ConfettiColor color) {
        return null;
    }
}
