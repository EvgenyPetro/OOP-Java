package HomeWork2.Zoo.Animal;

import HomeWork2.Zoo.BaseAnimal.WildAnimal;

public class Wolf extends WildAnimal {

    private boolean leaderOfThePack;

    public Wolf(int weight, int height, String eyeСolor, String habitat, String foundDate, boolean leaderOfThePack) {
        super(weight, height, eyeСolor, habitat, foundDate);
        this.leaderOfThePack = leaderOfThePack;
    }

    public boolean isLeaderOfThePack() {
        return leaderOfThePack;
    }

    @Override
    public String sound() {
        return "ууууууу";
    }

    @Override
    public String getInfo() {
        return String.format(Wolf.class.getSimpleName() + " %s, Вожак стаи: %s", super.getInfo(), leaderOfThePack ? "Да" : "Нет");
    }
}
