package Homework7

import Homework7.fileManager.PhoneBookManager
import Homework7.fileManager.reader.PhoneBookReader
import Homework7.fileManager.reader.impl.CSVPhoneBookReader
import Homework7.fileManager.writer.PhoneBookWriter
import Homework7.fileManager.writer.impl.CsvPhoneBookWriter
import Homework7.phonebook.PhoneBook
import Homework7.phonebook.impl.PhoneBookImpl

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val fileName = "Homework6/phonebook.csv"
        val writer: PhoneBookWriter = CsvPhoneBookWriter(fileName)
        val reader: PhoneBookReader = CSVPhoneBookReader(fileName)
        val manager = PhoneBookManager(writer, reader)
        val phoneBook: PhoneBook = PhoneBookImpl(manager.readContacts())
        phoneBook.infoWithContacts


    }
}