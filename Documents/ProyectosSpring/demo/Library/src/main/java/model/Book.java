package model;

import sun.util.calendar.LocalGregorianCalendar;

public class Book {

    private int id;
    private String tittle;
    private String author;
    private LocalGregorianCalendar.Date date;

    public Book(int id, String tittle, String author, LocalGregorianCalendar.Date date) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalGregorianCalendar.Date getDate() {
        return date;
    }

    public void setDate(LocalGregorianCalendar.Date date) {
        this.date = date;
    }
}
