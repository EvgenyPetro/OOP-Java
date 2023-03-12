package HomeWork2.Zoo.BaseAnimal;

public abstract class Animal {
    private int weight;
    private int height;
    private String eye;

    public Animal(int weight, int height, String eye) {
        this.weight = weight;
        this.height = height;
        this.eye = eye;
    }

    public abstract String sound();

    public String getInfo() {
        return String.format("Рост: %d, Вес: %d, Цвет глаз: %s", weight, height, eye);
    }
}
