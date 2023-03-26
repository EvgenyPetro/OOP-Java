package Homework6.phonebook.impl;

import Homework6.model.Contact;
import Homework6.phonebook.PhoneBook;

import java.util.List;

public class PhoneBookImpl implements PhoneBook {

    private List<Contact> contacts;

    public PhoneBookImpl(List<Contact> contacts) {
        this.contacts = contacts;
    }


    public String addContact(Contact contact) {
        if (!isExist(contact)) {
            contacts.add(contact);
            return "Ok";
        }
        return "Contact exist";
    }

    public String deleteContact(int index) {
        Contact contact = findContact(index);
        if (!isExist(contact)) {
            return "Contact not existing";
        }
        contacts.remove(contact);
        return "Contact deleted";
    }

    public Contact updateContact(int index, Contact contact) {
        if (!isExist(contact)) {
            addContact(contact);
            return contact;
        }

        contacts.set(index, contact);
        return contact;
    }

    public Contact findContact(int index) {
        if (index < 0 || index > contacts.size()) {
            throw new IndexOutOfBoundsException();
        }
        return contacts.get(index);

    }

    public void getInfoWithContacts() {
        contacts.forEach(System.out::println);
    }

    private boolean isExist(Contact contact) {
        return contacts.contains(contact);
    }
}
