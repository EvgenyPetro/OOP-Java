package HomeWork2;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Console.ConsoleHandlerFactory;
import HomeWork2.Zoo.Animal.Cat;
import HomeWork2.Zoo.Animal.Hen;
import HomeWork2.Zoo.Zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(12, 23, "blue",
                "barsik", "svinks", true, "brr", "12.12.21", false);
        Hen hen = new Hen(4, 1, "green", 2);
        Zoo zoo = new Zoo();
        zoo.addInZoo(cat);
        zoo.addInZoo(hen);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Зоопарк");

        while (true) {

            System.out.println("Введите команду");
            System.out.println("Добавить животного - 1");
            System.out.println("Убрать животного - 2");
            System.out.println("Печатать информацию о конкретном животном - 3");
            System.out.println("Печатать информацию о всех животных - 4");
            System.out.println("Заставлять животное издавать звук - 5");
            System.out.println("Заставлять издавать звук всех животных, - 6");
            System.out.println("Выйти - 7");
            String command = scanner.nextLine();
            ConsoleHandler handler = new ConsoleHandlerFactory().handle(command);
            handler.handle(zoo);
        }
    }
}
