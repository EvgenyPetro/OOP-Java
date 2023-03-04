package HomeWork1;

public class Eggs extends Food {
    private int countInPakage;

    public Eggs(String name, double price, int count, String ei, int bestBeforeDate, int countInPackage) {
        super(name, price, count, ei, bestBeforeDate);
        this.countInPakage = countInPackage;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", кол-во в упаковке: %s", countInPakage);
    }
}
