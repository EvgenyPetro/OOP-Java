package Homework7.phonebook.impl

import Homework7.model.Contact
import Homework7.phonebook.PhoneBook
import java.util.function.Consumer

class PhoneBookImpl(private val contacts: MutableList<Contact>) : PhoneBook {
    override fun addContact(contact: Contact?): String {
        if (!isExist(contact)) {
            if (contact != null) {
                contacts.add(contact)
            }
            return "Ok"
        }
        return "Contact exist"
    }

    override fun deleteContact(index: Int): String {
        val contact = findContact(index)
        if (!isExist(contact)) {
            return "Contact not existing"
        }
        contacts!!.remove(contact)
        return "Contact deleted"
    }

    override fun updateContact(index: Int, contact: Contact?): Contact? {
        if (!isExist(contact)) {
            addContact(contact)
            return contact
        }
        if (contact != null) {
            contacts[index] = contact
        }
        return contact
    }

    override fun findContact(index: Int): Contact {
        if (index < 0 || index > contacts.size) {
            throw IndexOutOfBoundsException()
        }
        return contacts[index]
    }

    override val infoWithContacts: Unit
        get() {
            contacts.forEach(Consumer { x: Contact? -> println(x) })
        }

    private fun isExist(contact: Contact?): Boolean {
        return contacts.contains(contact)
    }
}