package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.WildAnimal;

public class Tiger extends WildAnimal {


    public Tiger(int weight, int height, String eyeСolor, String habitat, String foundDate) {
        super(weight, height, eyeСolor, habitat, foundDate);
    }

    @Override
    public String sound() {
        return "РРРРРР";
    }

    @Override
    public String getInfo() {
        return Tiger.class.getSimpleName() + super.getInfo();
    }
}
