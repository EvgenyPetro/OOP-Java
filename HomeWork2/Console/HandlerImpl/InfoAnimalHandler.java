package HomeWork2.Console.HandlerImpl;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Zoo.Zoo;

import java.util.Scanner;

public class InfoAnimalHandler implements ConsoleHandler {
    int index;

    public InfoAnimalHandler(Scanner scanner) {
        System.out.println("Номер животного, о котором хотите получить информацию");
        this.index = scanner.nextInt();
    }

    @Override
    public void handle(Zoo zoo) {
        zoo.getInfoAboutAnimal(index);
    }
}
