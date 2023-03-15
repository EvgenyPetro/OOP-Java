package HomeWork3.Figure;

import HomeWork3.Figure.Base.Polygon;

public class Rectangle extends Polygon {
    public Rectangle(int a, int b) {
        super(new int[]{a, b});
    }

    public Rectangle() {
        this(2, 4);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return "Прямоугольник - " + super.toString();
    }
}
