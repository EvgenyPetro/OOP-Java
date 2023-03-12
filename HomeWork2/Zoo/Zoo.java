package HomeWork2.Zoo;

import HomeWork2.Zoo.BaseAnimal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addInZoo(Animal animal) {
        this.animals.add(animal);
        System.out.println("Добавлено");
    }

    public void deleteAnimal(int index) {
        if (isContains(index)) {
            this.animals.remove(index);
            System.out.println("Убрано");
        } else notFound();

    }

    public void getInfoAboutAnimal(int index) {
        if (isContains(index)) {
            Animal animal = getAnimal(index);
            System.out.println(animal.getInfo());
        } else notFound();
    }

    public void saySound(int index) {
        if (isContains(index)) {
            Animal animal = getAnimal(index);
            System.out.println(animal.sound());
        } else notFound();
    }

    public void getInfoAboutAnimals() {
        this.animals.forEach(animal -> System.out.println(animal.getInfo()));
    }

    public void sayAllSounds() {
        this.animals.forEach(animal -> System.out.println(animal.sound()));
    }

    private Animal getAnimal(int index) {
        return this.animals.get(index);
    }

    private boolean isContains(int index) {
        return this.animals.size() > index;
    }

    private void notFound() {
        System.out.println("Животного с таким номером нет");
    }

}
