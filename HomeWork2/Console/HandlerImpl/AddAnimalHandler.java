package HomeWork2.Console.HandlerImpl;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Zoo.Animal.*;
import HomeWork2.Zoo.BaseAnimal.Animal;
import HomeWork2.Zoo.Zoo;

import java.util.Scanner;

public class AddAnimalHandler implements ConsoleHandler {
    Scanner scanner;

    public AddAnimalHandler(Scanner scanner) {
        System.out.println("Какого животного вы хотите добавить");
        System.out.println("Кот - 1\nСобака -2");
        System.out.println("Курица - 3\nАист -4");
        System.out.println("Тигр - 5\nВолк -6");
        this.scanner = scanner;
    }

    @Override
    public void handle(Zoo zoo) {
        zoo.addInZoo(addAnimal());
    }

    private int fieldInt(String string) {
        System.out.println(string);
        return scanner.nextInt();
    }

    private String fieldString(String string) {
        System.out.println(string);
        return scanner.nextLine();
    }

    private boolean fieldBoolean(String string) {
        System.out.println(string);
        String str = scanner.nextLine().toLowerCase();
        return str.equals("да");
    }

    private Animal addAnimal() {
        Animal animal = null;
        switch (scanner.nextInt()) {
            case 1:
                animal = new Cat(
                        fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldString("Кличка"),
                        fieldString("Порода"),
                        fieldBoolean("Есть прививки(Да/Нет)"),
                        fieldString("Цвет шерсти"),
                        fieldString("Дата рождения"),
                        fieldBoolean("Наличие шерсти(Да/Нет)"));
                break;
            case 2:
                animal = new Dog(fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldString("Кличка"),
                        fieldString("Порода"),
                        fieldBoolean("Есть прививки(Да/Нет)"),
                        fieldString("Цвет шерсти"),
                        fieldString("Дата рождения"),
                        fieldBoolean("Возможность тренировки(Да/Нет)"));
                break;
            case 3:
                animal = new Hen(fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldInt("Высота полета"));
                break;
            case 4:
                animal = new Stork(fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldInt("Высота полета"));
                break;
            case 5:
                animal = new Tiger(fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldString("Место обитания"),
                        fieldString("Дата нахождения"));
                break;
            case 6:
                animal = new Wolf(fieldInt("Вес"),
                        fieldInt("Рост"),
                        fieldString("Цвет глаз"),
                        fieldString("Место обитания"),
                        fieldString("Дата нахождения"),
                        fieldBoolean("Вожак стаи?(Да/Нет)"));
                break;
        }
        return animal;
    }


}
