package Homework6.fileManager;

import Homework6.fileManager.reader.PhoneBookReader;
import Homework6.fileManager.writer.PhoneBookWriter;
import Homework6.model.Contact;

import java.util.List;

public class PhoneBookManager {
    private PhoneBookWriter writer;
    private PhoneBookReader reader;

    public PhoneBookManager(PhoneBookWriter writer, PhoneBookReader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void saveContact(Contact contacts) {
        writer.save(contacts);
    }

    public List<Contact> readContacts() {
        return reader.readPhoneBook();
    }
}
