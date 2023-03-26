package Homework6.fileManager.writer.impl;


import Homework6.fileManager.writer.PhoneBookWriter;
import Homework6.model.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvPhoneBookWriter implements PhoneBookWriter {

    private PrintWriter writer;


    public CsvPhoneBookWriter(String file) {
        try {
            this.writer = new PrintWriter(new FileWriter(file, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Contact phoneBook) {
        writer.println("\n");
        writer.printf("%s %s: %s", phoneBook.getName(), phoneBook.getSurname(), phoneBook.getPhone());
        writer.flush();
    }


}
