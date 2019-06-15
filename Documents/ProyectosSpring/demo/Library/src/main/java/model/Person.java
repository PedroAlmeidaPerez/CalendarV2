package model;

import java.util.ArrayList;

public class Person {
    private String name;
    private int idBook;
    private int Id;
    private static int IdNext=1;

    public Person(String name) {
        this.name = name;
        Id=IdNext;
        IdNext++;
    }

    public Person(String name, int idBook) {
        this.name = name;
        this.idBook = idBook;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }


}
