package Homework5;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        PhoneBookReader phoneBookReader = new CSVPhoneBookReader(new File("Homework5/phonebook.csv"));
        PhoneBookWriter phoneBookWriter = new CsvPhoneBookWriter("Homework5/phonebook.csv");

        PhoneBookService service = new PhoneBookService(phoneBookReader, phoneBookWriter);

        service.printBook();

        PhoneBook phoneBook1 = new PhoneBook("Filip", "Ivanovich", "89213452345");
        PhoneBook phoneBook2 = new PhoneBook("Albert", "Rodionovich", "89213452345");

        service.writePhone(phoneBook1);
        service.writePhone(phoneBook2);
    }

}
