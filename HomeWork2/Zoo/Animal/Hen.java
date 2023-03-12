package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.Bird;

public class Hen extends Bird {
    public Hen(int weight, int height, String eyeСolor, int flightAltitude) {
        super(weight, height, eyeСolor, flightAltitude);
    }

    @Override
    public String sound() {
        return "Цип цип";
    }

    @Override
    public String getInfo() {
        return Hen.class.getSimpleName() + super.getInfo();
    }
}
