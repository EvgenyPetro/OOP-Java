package HomeWork1;

public class Beverages extends Product {
    private int volume;

    public Beverages(String name, double price, int count, String ei, int volume) {
        super(name, price, count, ei);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", объем: %s", volume);
    }
}
