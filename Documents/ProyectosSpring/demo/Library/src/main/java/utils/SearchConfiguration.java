package utils;

import model.Book;
import model.Library;

import java.util.ListIterator;
import java.util.Scanner;

public class SearchConfiguration {
    private String tittle;
    private String author;
    public void searchByTittle (){
        System.out.println("Introduce a tittle to search: ");
        Scanner scanner = new Scanner(System.in);
        tittle = scanner.nextLine();
        ListIterator<Book> iter1 = Library.getBook().listIterator();
        Book auxBook = iter1.next();
        while (iter1.hasNext()){
            if(auxBook.getTittle().equals(tittle)){
                System.out.println(auxBook.getId() + " " + auxBook.getTittle() + " " + auxBook.getAuthor() + " " + auxBook.getYear() + " " + auxBook.getStatus());
            }
            auxBook = iter1.next();
        }
    }

    public void searchByAuthor() {
        System.out.println("Introduce the Author to search: ");
        Scanner scanner = new Scanner(System.in);
        author = scanner.nextLine();
        ListIterator<Book> iter1 = Library.getBook().listIterator();
        Book auxAuthor = iter1.next();
        while (iter1.hasNext()){
            if(auxAuthor.getAuthor().equals(author)){
                System.out.println(auxAuthor.getId() + " " + auxAuthor.getTittle() + " " + auxAuthor.getAuthor() + " " + auxAuthor.getYear() + " " + auxAuthor.getStatus());
            }
            auxAuthor = iter1.next();
        }
    }

    public void searchByYear() {
        System.out.println("search by year");
    }

    public void searchByAuthorAndTittle() {
        boolean found=false;
        Scanner scannAuthor = new Scanner(System.in);
        Scanner sccannTittle = new Scanner(System.in);
        System.out.println("search by Author and Tittle");
        System.out.println("Introduce a tittle to search: ");
        tittle = sccannTittle.nextLine();
        System.out.println("Introduce the Author to search: ");
        author = scannAuthor.nextLine();
        ListIterator<Book> iter1 = Library.getBook().listIterator();
        Book book = iter1.next();
        while (iter1.hasNext()){
            if((book.getAuthor().equals(author)) && (book.getTittle().equals(tittle))){
                book.showBook(book);
                found = true;
            }
            book = iter1.next();
        }
        if(!found){
            System.out.println("book not found");
        }
    }
}
