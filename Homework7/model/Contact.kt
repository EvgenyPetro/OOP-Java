package Homework7.model

import java.util.*

class Contact(var name: String, var surname: String, var phone: String) {

    override fun toString(): String {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}'
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val contact = o as Contact
        return name == contact.name && surname == contact.surname && phone == contact.phone
    }

    override fun hashCode(): Int {
        return Objects.hash(name, surname, phone)
    }
}