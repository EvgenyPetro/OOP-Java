package HomeWork1;


public class Milk extends Beverages {
    private double fatPercentage;
    private int bestBeforeDate;

    public Milk(String name, double price, int count, String ei, int volume, double fatPercentage, int bestBeforeDate) {
        super(name, price, count, ei, volume);
        this.fatPercentage = fatPercentage;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", процент жирности: %s, срок годности: %s", fatPercentage, bestBeforeDate);
    }
}
