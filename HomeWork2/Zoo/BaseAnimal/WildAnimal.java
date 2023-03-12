package HomeWork2.Zoo.BaseAnimal;

public abstract class WildAnimal extends Animal {

    private String habitat;
    private String foundDate;

    public WildAnimal(int weight, int height, String eyeСolor, String habitat, String foundDate) {
        super(weight, height, eyeСolor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    @Override
    public String getInfo() {
        return String.format(" %s, Место обитания: %s, Дата нахождения: %s", super.getInfo(), habitat, foundDate);
    }
}
