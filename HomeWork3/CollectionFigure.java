package HomeWork3;

import HomeWork3.Figure.Circle;
import HomeWork3.Figure.Base.Figure;
import HomeWork3.Figure.Base.Polygon;

import java.util.Comparator;
import java.util.List;

public class CollectionFigure {
    private List<Figure> collectionFigure;

    public CollectionFigure(List<Figure> collectionFigure) {
        this.collectionFigure = collectionFigure;
    }

    public CollectionFigure() {
    }

    public String addFigure(Figure figure) {
        collectionFigure.add(figure);
        return "added";
    }

    public String deleteFigure(int index) {
        collectionFigure.remove(index);
        return "deleted";
    }

    public Figure refactorFigure(int index, Figure figure) {
        collectionFigure.set(index, figure);
        return figure;
    }

    public void getInfo() {
        collectionFigure.forEach(System.out::println);
    }

    public void getInfoWithSorting() {
        sortingFigure().forEach(System.out::println);
    }

    private List<Figure> sortingFigure() {
        collectionFigure.sort(Comparator.comparingDouble(Figure::area));
        return collectionFigure;
    }


}
