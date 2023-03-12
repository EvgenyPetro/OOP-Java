package HomeWork2.Console.HandlerImpl;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Zoo.Zoo;

import java.util.Scanner;

public class SoundAnimalHandler implements ConsoleHandler {
    int index;

    public SoundAnimalHandler(Scanner scanner) {
        System.out.println("Введите номер животного");
        this.index = scanner.nextInt();
    }

    public void handle(Zoo zoo) {
        zoo.saySound(this.index);
    }
}
