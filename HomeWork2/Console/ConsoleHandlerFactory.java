package HomeWork2.Console;

import HomeWork2.Console.HandlerImpl.*;

import java.util.Scanner;

public class ConsoleHandlerFactory {
    Scanner scanner = new Scanner(System.in);

    public ConsoleHandlerFactory() {
    }

    public ConsoleHandler handle(String name) {
        ConsoleHandler handler = null;
        switch (name) {
            case "1":
                handler = new AddAnimalHandler(scanner);
                break;
            case "2":
                handler = new DeleteAnimalHandler(scanner);
                break;
            case "3":
                handler = new InfoAnimalHandler(scanner);
                break;
            case "4":
                handler = new InfosAnimalsInfoHandler();
                break;
            case "5":
                handler = new SoundAnimalHandler(scanner);
                break;
            case "6":
                handler = new SoundsAnimalsHandler();
                break;
            case "7": System.exit(1);
        }
        return handler;
    }
}
