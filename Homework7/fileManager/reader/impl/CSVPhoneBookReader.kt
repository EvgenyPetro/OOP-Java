package Homework7.fileManager.reader.impl

import Homework7.fileManager.reader.PhoneBookReader
import Homework7.model.Contact
import java.io.File
import java.io.IOException
import java.util.*

class CSVPhoneBookReader(file: String?) : PhoneBookReader {
    var scanner: Scanner? = null
    var phoneBook: MutableList<Contact> = ArrayList()

    init {
        try {
            scanner = Scanner(File(file))
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    override fun readPhoneBook(): MutableList<Contact> {
        while (scanner!!.hasNext()) {
            val phoneBook = scanner!!.nextLine().split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            if (phoneBook.size > 1) {
                val name = phoneBook[0].split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
                val surname = phoneBook[0].split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1]
                val phone = phoneBook[1]
                this.phoneBook.add(Contact(name, surname, phone))
            }
        }
        return phoneBook
    }
}