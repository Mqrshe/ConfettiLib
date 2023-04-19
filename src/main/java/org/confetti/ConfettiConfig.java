package org.confetti;

public class ConfettiConfig {

    private final ConfettiShape shape;
    private final ConfettiSize size;
    private final ConfettiColor color;
    private final float velocity;
    private final float angle;
    private final float acceleration;
    private final float rotationSpeed;
    private final int numConfetti;
    private final int maxConfettiToAdd;

    public int getMinConfettiToAdd() {
        return 10;
    }

    public ConfettiSize getMinConfettiSize() {
        return ConfettiSize.SMALL;
    }


    public ConfettiConfig(ConfettiShape shape, ConfettiSize size, ConfettiColor color, float velocity,
                          float angle, float acceleration, float rotationSpeed, int numConfetti, int maxConfettiToAdd) {
        this.shape = shape;
        this.size = size;
        this.color = color;
        this.velocity = velocity;
        this.angle = angle;
        this.acceleration = acceleration;
        this.rotationSpeed = rotationSpeed;
        this.numConfetti = numConfetti;
        this.maxConfettiToAdd = maxConfettiToAdd;
    }

    public ConfettiShapeFactory getConfettiFactory() {
        ConfettiShapeFactory factory = null;
        switch (this.shape) {
            case SQUARE:
                factory = new SquareConfettiShapeFactory();
                break;
            case CIRCLE:
                factory = new CircleConfettiShapeFactory();
                break;
            // add more cases for other shapes here
        }
        return factory;
    }



    public ConfettiShape getShape() {
        return shape;
    }

    public ConfettiSize getSize() {
        return size;
    }

    public ConfettiColor getColor() {
        return color;
    }

    public float getVelocity() {
        return velocity;
    }

    public float getAngle() {
        return angle;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float getRotationSpeed() {
        return rotationSpeed;
    }

    public int getNumConfetti() {
        return numConfetti;
    }

    public int getMaxConfettiToAdd() {
        return maxConfettiToAdd;
    }
}
