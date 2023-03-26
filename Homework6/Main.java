package Homework6;

import Homework6.fileManager.*;
import Homework6.fileManager.reader.impl.CSVPhoneBookReader;
import Homework6.fileManager.reader.PhoneBookReader;
import Homework6.fileManager.writer.impl.CsvPhoneBookWriter;
import Homework6.fileManager.writer.PhoneBookWriter;
import Homework6.phonebook.*;
import Homework6.phonebook.impl.PhoneBookImpl;

public class Main {
    public static void main(String[] args) {

        String fileName = "Homework6/phonebook.csv";
        PhoneBookWriter writer = new CsvPhoneBookWriter(fileName);
        PhoneBookReader reader = new CSVPhoneBookReader(fileName);
        PhoneBookManager manager = new PhoneBookManager(writer, reader);

        PhoneBook phoneBook = new PhoneBookImpl(manager.readContacts());

        phoneBook.getInfoWithContacts();

//        Contact contact1 = new Contact("Elisey", "Moiseev", "89211123775");
//        Contact contact2 = new Contact("Anna", "Ivanova", "89213898345");
//        phoneBook.addContact(contact1);
//        phoneBook.addContact(contact2);
//
//        manager.saveContact(contact1);
//        manager.saveContact(contact2);
//
//        phoneBook.getInfoWithContacts();

    }
}
