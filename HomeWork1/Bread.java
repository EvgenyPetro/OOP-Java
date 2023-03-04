package HomeWork1;

public class Bread extends Food {
    private String lourType;

    public Bread(String name, double price, int count, String ei, int bestBeforeDate, String lourType) {
        super(name, price, count, ei, bestBeforeDate);
        this.lourType = lourType;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", мука: %s", lourType);
    }
}
