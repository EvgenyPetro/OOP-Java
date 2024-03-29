package Homework5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVPhoneBookReader implements PhoneBookReader {

    Scanner scanner;
    List<Contact> phoneBook = new ArrayList<>();

    public CSVPhoneBookReader(File file) {
        try {
            this.scanner = new Scanner(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Contact> readPhone() {

        while (scanner.hasNext()) {
            String[] phoneBook = scanner.nextLine().split(": ");
            if (phoneBook.length > 1) {
                String name = phoneBook[0].split(" ")[0];
                String surname = phoneBook[0].split(" ")[1];
                String phone = phoneBook[1];
                this.phoneBook.add(new Contact(name, surname, phone));
            }
        }
        return phoneBook;
    }
}
