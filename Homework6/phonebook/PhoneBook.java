package Homework6.phonebook;

import Homework6.model.Contact;

public interface PhoneBook {
    String addContact(Contact contact);

    String deleteContact(int index);

    Contact updateContact(int index, Contact contact);

    Contact findContact(int index);

    void getInfoWithContacts();
}
