package model;

import java.util.Date;

public class Book {
    /*se crea IdNext para no tener que poner Id public y poder respetar la encapsulacion*/
    private int Id;
    private static int IdNext = 1;
    private String tittle;
    private String author;
    private String year;
    private boolean status;
    private String lent;
    private int IdLent;

    public Book(String tittle) {
        this.tittle = tittle;
        Id = IdNext;
        IdNext++;

    }

    public Book(String tittle, String author, String year) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        Id = IdNext;
        IdNext++;
    }

    public int getId() {
        return Id;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLent() {
        return lent;
    }

    public void setLent(String lent) {
        this.lent = lent;
    }

    public int getIdLent() {
        return IdLent;
    }

    public void setIdLent(int idLent) {
        IdLent = idLent;
    }

    public void showBook(Book book) {
        System.out.print("Id: " + book.getId() +
                " Tittle: " + book.getTittle() +
                " Author: " + book.getAuthor() +
                " Year: " + book.getYear() +
                " Status: ");

        if (book.getStatus()) {
            System.out.println("lent");
        } else {
            System.out.println("not lent");
        }
        //System.out.println(book.getId() + " " + book.getTittle() + " " + book.getAuthor() + " " + book.getYear() + " " + book.getStatus());
    }

    public static void showBooks() {
       // System.out.println("Id     Tittle              Author                  Year            Status");
        for (Book listBook : Library.getBook()
                ) {
            System.out.print("Id: " + listBook.getId() +
                             " Tittle: " + listBook.getTittle() +
                             " Author: " + listBook.getAuthor() +
                             " Year: " + listBook.getYear() +
                              " Status: ");

            if (listBook.getStatus()) {
                System.out.println("lent");
            } else {
                System.out.println("not lent");
            }

        }

    }
}
