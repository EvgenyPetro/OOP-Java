package Homework7.fileManager.reader

import Homework7.model.Contact

interface PhoneBookReader {
    fun readPhoneBook(): MutableList<Contact>
}