package HomeWork3.Figure.Base;

import HomeWork3.FigureArgumentException;

import java.util.Arrays;

public abstract class Polygon implements Figure, Perimeterable {
    protected int[] sides;

    protected Polygon(int[] sides) {
        if (Arrays.stream(sides).min().getAsInt() <= 0) {
            throw new FigureArgumentException("Сторона не может быть меньше 0");
        }
        this.sides = sides;

    }

    @Override
    public double perimetr() {
        return Arrays.stream(sides).sum();
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return String.format("Периметр: %.2f, Площадь: %.2f", perimetr(), area());
    }
}
