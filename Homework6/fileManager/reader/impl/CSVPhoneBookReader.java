package Homework6.fileManager.reader.impl;

import Homework6.fileManager.reader.PhoneBookReader;
import Homework6.model.Contact;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVPhoneBookReader implements PhoneBookReader {

    Scanner scanner;
    List<Contact> phoneBook = new ArrayList<>();

    public CSVPhoneBookReader(String file) {
        try {
            this.scanner = new Scanner(new File(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Contact> readPhoneBook() {

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
