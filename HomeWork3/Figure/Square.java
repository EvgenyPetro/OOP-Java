package HomeWork3.Figure;

public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }

    public Square() {
        this(4);
    }

    @Override
    public String toString() {
        return "Квадрат - " + super.toString();
    }
}
