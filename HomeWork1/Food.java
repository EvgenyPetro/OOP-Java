package HomeWork1;


public class Food extends Product {
    private int bestBeforeDate;

    public Food(String name, double price, int count, String ei, int bestBeforeDate) {
        super(name, price, count, ei);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", срок годности: %s дней", bestBeforeDate);
    }
}
