package HomeWork3;

import HomeWork3.Figure.*;
import HomeWork3.Figure.Base.Figure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figure = new ArrayList<>();

        figure.add(new Circle());
        figure.add(new Rectangle());
        figure.add(new Square());
        figure.add(new Triangle());

        CollectionFigure collectionFigure = new CollectionFigure(figure);
        collectionFigure.getInfoWithSorting();

        collectionFigure.refactorFigure(1, new Rectangle(1, 1));

        System.out.println();
        collectionFigure.getInfoWithSorting();
    }
}
