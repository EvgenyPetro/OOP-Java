package HomeWork3.Figure;

import HomeWork3.Figure.Base.Figure;
import HomeWork3.Figure.Base.Lengthable;
import HomeWork3.FigureArgumentException;

public class Circle implements Figure, Lengthable {

    protected int radius;

    public Circle(int radius) {
        if (radius <= 0){
            throw new FigureArgumentException("Радиус круга не может быть меньше нуля");
        }
            this.radius = radius;
    }

    public Circle() {
        this(4);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double lenght() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Круг - Длиннах окружности: %.2f, Площадь: %.2f", lenght(), area());
    }
}
