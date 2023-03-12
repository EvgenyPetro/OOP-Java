package HomeWork2.Zoo.BaseAnimal;

public abstract class HomeAnimal extends Animal {
    private String nickName;
    private String breed;
    private boolean vaccinations;
    private String coatColor;
    private String birthDay;


    public HomeAnimal(int weight, int height, String eye,
                      String nickName, String breed, boolean vaccinations,
                      String coatColor, String birthDay) {
        super(weight, height, eye);
        this.nickName = nickName;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthDay = birthDay;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(boolean vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public abstract String showAffection();

    @Override
    public String getInfo() {
        return String.format(" %s, Кличка: %s, Порода: %s, " +
                        "Наличие прививок: %s, Цвет шерсти: %s, " +
                        "Дата рождения: %s ",
                super.getInfo(), nickName, breed, vaccinations ? "Да" : "Нет", coatColor, birthDay);
    }
}
