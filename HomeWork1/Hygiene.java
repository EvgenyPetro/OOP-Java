package HomeWork1;

public class Hygiene extends Product {
    private int countInPackage;

    public Hygiene(String name, double price, int count, String ei, int countInPackage) {
        super(name, price, count, ei);
        this.countInPackage = countInPackage;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", кол-во в упаковке: %s", countInPackage);
    }
}
