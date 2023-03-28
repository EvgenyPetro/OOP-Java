package Homework7.phonebook

import Homework7.model.Contact

interface PhoneBook {
    fun addContact(contact: Contact?): String
    fun deleteContact(index: Int): String
    fun updateContact(index: Int, contact: Contact?): Contact?
    fun findContact(index: Int): Contact?
    val infoWithContacts: Unit
}