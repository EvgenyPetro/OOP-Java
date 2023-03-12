package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.HomeAnimal;

public class Cat extends HomeAnimal {
    private boolean wool;

    public Cat(int weight, int height, String eye,
               String nickName, String breed, boolean vaccinations, String coatColor, String birthDay, boolean wool) {
        super(weight, height, eye, nickName, breed, vaccinations, coatColor, birthDay);
        this.wool = wool;
    }

    public boolean getWool() {
        return wool;
    }

    @Override
    public String sound() {
        return "Мяу мяу";
    }

    @Override
    public String getInfo() {
        return String.format(Cat.class.getSimpleName() + " %s, Наличие шерсти: %s", super.getInfo(), wool ? "Да" : "Нет");
    }

    @Override
    public String showAffection() {
        return null;
    }
}
