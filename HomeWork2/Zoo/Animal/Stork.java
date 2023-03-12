package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.Bird;

public class Stork extends Bird {
    public Stork(int weight, int height, String eyeСolor, int flightAltitude) {
        super(weight, height, eyeСolor, flightAltitude);
    }


    @Override
    public String sound() {
        return "Кр кр";
    }

    @Override
    public String getInfo() {
        return Stork.class.getSimpleName() + super.getInfo();
    }
}
