package HomeWork1;

public class Product {
    private String name;
    private double price;
    private int count;
    private String ei;

    public Product(String name, double price, int count, String ei) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.ei = ei;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s %s", name, price, count, ei);
    }
}
