package Homework7.fileManager

import Homework7.fileManager.reader.PhoneBookReader
import Homework7.fileManager.writer.PhoneBookWriter
import Homework7.model.Contact

class PhoneBookManager(private val writer: PhoneBookWriter, private val reader: PhoneBookReader) {
    fun saveContact(contacts: Contact) {
        writer.save(contacts)
    }

    fun readContacts(): MutableList<Contact> {
        return reader.readPhoneBook()
    }
}