package Homework7.fileManager.writer

import Homework7.model.Contact

interface PhoneBookWriter {
    fun save(contact: Contact)
}