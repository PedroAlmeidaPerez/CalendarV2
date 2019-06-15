package utils;

import data.DataBook;
import model.Book;
import model.Library;
import model.Person;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BookConfiguration {

    public static void addBook (){
        String option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to fill the collection automatically? Y/N");
        option  = scanner.nextLine();
        if(option.equals("N")){
            //Scanner scanner = new Scanner(System.in);
            System.out.println("For finishing adding books you must write exit or 0");
            do {
                String tittle = scanner.nextLine();
                Library.book.add(new Book(tittle));
            }while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0"))));
        }else{
            DataBook.dataInsert();
        }




        Book.showBooks();
        //return Library.getBook();
    }

    public static void deleteBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the ID from the book that you want to delete: ");
        int Id = scanner.nextInt();
        ListIterator<Book> iter = Library.getBook().listIterator();
        int ind = searchBook(Id);
        Book book = Library.book.get(ind);
        if(!book.getStatus()){
            System.out.println("si esta");
            for (int i = 0; i <= ind; i++){
                iter.next();
            }
            iter.remove();
        }else{
            if (book.getStatus()){
                System.out.println(("Can not be deleted because the book is lent by: ") + book.getLent() + " " + book.getIdLent());
            }else{
                System.out.println("no esta");
            }
        }
    }

    public static int searchBook(int Id){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Book> iter1 = Library.getBook().listIterator();
        int auxId = iter1.next().getId();
        while (iter1.hasNext()){
            if(auxId == Id){
                System.out.println("si esta");
                return iter1.nextIndex()-1;
            }else{
                System.out.println("no esta");
                auxId = iter1.next().getId();
            }
        }
        return -1;
    }

    public static void  lentBook(Person person){
        ListIterator<Book> iter1 = Library.getBook().listIterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which book do you want to rent (by Id)?");
        Book.showBooks();
        int Id = scanner.nextInt();
        int ind = BookConfiguration.searchBook(Id);
        Book book = Library.book.get(ind);
        book.showBook(book);
        if (book.getStatus()){
            System.out.println("Sorry but this book is lent by: " + book.getLent());
        }else{
            book.setStatus(true);
            book.setLent(person.getName());
            book.setIdLent(person.getId());
            person.setIdBook(book.getId());
            System.out.println(("You have lent the book: ") + book.getTittle());
        }
    }

    public static void booksAvailable (){
        int countAvailable=0;
        int countNoAvailable=0;
        for (Book listBooks: Library.getBook()
             ) {
            if (listBooks.getStatus()){
                countNoAvailable++;
            }else{
                countAvailable++;
            }
        }
        System.out.println("Number of books available: " + countAvailable);
        System.out.println("Number of books not available: " + countNoAvailable);
    }
}
