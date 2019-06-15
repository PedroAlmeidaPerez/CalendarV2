package data;

import model.Book;
import model.Library;

public class DataBook {
    public static void dataInsert(){
        Library.book.add(new Book("Luces de bohemia", "Ramón","1998"));
        Library.book.add(new Book("Crimen y castigo", "Fyodor","1998"));
        Library.book.add(new Book("Las almas muertas", "Nicolai","1998"));
        Library.book.add(new Book("Preludio a la fundación", "Fyodor","1998"));
        Library.book.add(new Book("Crimen", "Fyodor","1984"));
        Library.book.add(new Book("Crimen2", "Fyodor","1998"));
        Library.book.add(new Book("Crimen3", "Fyodor","1984"));
        Library.book.add(new Book("Crimen", "Fyodor","1998"));
        Library.book.add(new Book("Crimen", "Fyodor","1999"));
        Library.book.add(new Book("Crimen", "Fyodor","2000"));
        Library.book.add(new Book("Crimen", "Fyodor","1999"));
    }
}
