package HomeWork3.Figure;

import HomeWork3.Figure.Base.Polygon;
import HomeWork3.FigureArgumentException;

import java.util.Arrays;
import java.util.OptionalInt;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c) {
        super(new int[]{a, b, c});
    }


    public Triangle() {
        this(2, 3, 4);
    }

    @Override
    public double area() {
        double p = perimetr() / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return "Треугольник - " + super.toString();
    }
}
