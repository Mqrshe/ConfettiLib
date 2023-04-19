package org.confetti;

import java.awt.Color;

public enum ConfettiColor {
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    YELLOW(Color.YELLOW),
    PINK(Color.PINK),
    ORANGE(Color.ORANGE),
    PURPLE(new Color(0x800080)),
    TEAL(new Color(0x008080)),
    GOLD(new Color(0xFFD700)),
    SILVER(new Color(0xC0C0C0)),
    WHITE(Color.WHITE),
    BLACK(Color.BLACK);

    private final Color color;

    ConfettiColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
