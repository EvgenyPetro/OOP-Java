package Homework5;

public class PhoneBookService {


    private PhoneBookReader phoneBookReader;
    private PhoneBookWriter phoneBookWriter;

    public PhoneBookService(PhoneBookReader phoneBookReader, PhoneBookWriter phoneBookWriter) {
        this.phoneBookReader = phoneBookReader;
        this.phoneBookWriter = phoneBookWriter;
    }

    public void printBook() {
        phoneBookReader.readPhone().forEach(System.out::println);
    }

    public void writePhone(Contact phoneBook) {
        phoneBookWriter.writePhoneBook(phoneBook);
    }
}
