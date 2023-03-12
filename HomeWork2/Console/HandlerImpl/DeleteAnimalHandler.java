package HomeWork2.Console.HandlerImpl;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Zoo.Zoo;

import java.util.Scanner;

public class DeleteAnimalHandler implements ConsoleHandler {
    int index;

    public DeleteAnimalHandler(Scanner scanner) {
        System.out.println("Номер животного которого надо убрать с зоопарка");
        this.index = scanner.nextInt();
    }

    @Override
    public void handle(Zoo zoo) {
        zoo.deleteAnimal(index);
    }
}
