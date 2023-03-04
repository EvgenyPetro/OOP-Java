package HomeWork1;

public class Diapers extends Hygiene {
    private int size;
    private int maxWeight;
    private int minWeight;

    public Diapers(String name, double price, int count, String ei, int countInPakage, int size, int maxWeight, int minWeight) {
        super(name, price, count, ei, countInPakage);
        this.size = size;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }


    @Override
    public String toString() {
        return String.format(super.toString() + ", размер: %s, макс. вес: %s, мин. вес: %s", size, maxWeight, minWeight);
    }
}
