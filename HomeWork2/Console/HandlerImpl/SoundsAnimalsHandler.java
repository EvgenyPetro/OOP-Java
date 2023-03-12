package HomeWork2.Console.HandlerImpl;

import HomeWork2.Console.ConsoleHandler;
import HomeWork2.Zoo.Zoo;

public class SoundsAnimalsHandler implements ConsoleHandler {
    @Override
    public void handle(Zoo zoo) {
        zoo.sayAllSounds();
    }
}
