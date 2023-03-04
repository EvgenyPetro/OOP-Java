package HomeWork1;

public class KidsProduct extends Product {
    private int minAge;
    private boolean hypoallergenic;

    public KidsProduct(String name, double price, int count, String ei, int minAge, boolean hypoallergenic) {
        super(name, price, count, ei);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", минимальный возраст: %s, гипоалергенный(ая): %s", minAge, hypoallergenic ? "да" : "нет");
    }
}
