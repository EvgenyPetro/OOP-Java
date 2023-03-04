package HomeWork1;

public class ToiletPaper extends Hygiene{
    private int layersCount;

    public ToiletPaper(String name, double price, int count, String ei, int countInPakage, int layersCount) {
        super(name, price, count, ei, countInPakage);
        this.layersCount = layersCount;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", кол-во слоев: %s", layersCount);
    }
}
