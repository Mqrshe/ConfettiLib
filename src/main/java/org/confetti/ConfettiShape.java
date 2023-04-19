package org.confetti;

public enum ConfettiShape {
    SQUARE("square"),
    CIRCLE("circle"),
    TRIANGLE("triangle");

    private final String name;

    ConfettiShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
