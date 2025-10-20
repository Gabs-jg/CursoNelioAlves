package Seção16.Example2.model.entities;

import Seção16.Example2.model.enums.Color;

public abstract class AbstractShape implements Shape{
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
