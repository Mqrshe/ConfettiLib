package org.confetti;

public enum ConfettiSize {
    SMALL("small", 10),
    MEDIUM("medium", 15),
    LARGE("large", 20);

    private final String name;
    private final int size;

    ConfettiSize(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return size;
    }
}
