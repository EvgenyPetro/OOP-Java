package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.HomeAnimal;

public class Dog extends HomeAnimal {

    private boolean presenceOfTraining;

    public Dog(int weight, int height, String eye, String nickName,
               String breed, boolean vaccinations, String coatColor, String birthDay, boolean presenceOfTraining) {
        super(weight, height, eye, nickName, breed, vaccinations, coatColor, birthDay);
        this.presenceOfTraining = presenceOfTraining;
    }

    public void training() {

    }

    public boolean isPresenceOfTraining() {
        return presenceOfTraining;
    }

    @Override
    public String sound() {
        return "Гав гав";
    }

    @Override
    public String getInfo() {
        return String.format(Dog.class.getSimpleName() + " %s, Наличие дрессировки: %s", super.getInfo(), presenceOfTraining ? "Да" : "Нет");
    }

    @Override
    public String showAffection() {
        return null;
    }
}
