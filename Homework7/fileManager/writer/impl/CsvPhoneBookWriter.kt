package Homework7.fileManager.writer.impl

import Homework7.fileManager.writer.PhoneBookWriter
import Homework7.model.Contact
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class CsvPhoneBookWriter(file: String?) : PhoneBookWriter {
    private var writer: PrintWriter? = null

    init {
        try {
            writer = PrintWriter(FileWriter(file, true))
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    override fun save(contact: Contact) {
        writer!!.println("\n")
        writer!!.printf("%s %s: %s", contact.name, contact.surname, contact.phone)
        writer!!.flush()
    }
}