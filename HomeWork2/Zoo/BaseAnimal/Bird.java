package HomeWork2.Zoo.BaseAnimal;

public abstract class Bird extends Animal {
    private int flightAltitude;

    protected Bird(int weight, int height, String eyeСolor, int flightAltitude) {
        super(weight, height, eyeСolor);
        this.flightAltitude = flightAltitude;
    }

    public void fly() {
        System.out.printf("Я лечу на %d метрах", this.flightAltitude);
    }

    @Override
    public String getInfo() {
        return String.format(" %s, Высота полёта: %d", super.getInfo(), flightAltitude);
    }
}
