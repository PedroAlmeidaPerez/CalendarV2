package utils;

import model.Book;
import model.Library;
import model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PersonConfiguration {
    //public static ArrayList<Person> person = new ArrayList();

    public static ArrayList addPersons (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For finishing adding persons you must write exit or 0");
        do {
            String name = scanner.nextLine();
            Library.person.add(new Person(name));

        }while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0"))));
        for (Person listPerson : Library.person
                ) {
            System.out.println(listPerson.getName());
        }
        return Library.person;
    }

    public static Person searchPerson(){
        Book book;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the name of the Person that wants to rent the book: ");
        String name = scanner.nextLine();
        ListIterator<Person> iter = Library.getPerson().listIterator();
        String auxName = iter.next().getName();
        while (iter.hasNext()){

            if(auxName.equals(name)){
                return iter.previous();
               ////// System.out.println("Which book do you want to rent (by Id)?");
             ///////   Library.showBooks();
             ///////   int Id = scanner.nextInt();
                //BookConfiguration.searchBook(Id);
             //////   book = BookConfiguration.searchBook(Id);
               // System.out.println(BookConfiguration.searchBook(Id).getTittle());
             //////   book.showBook(book);
            //////*   if (book.getStatus()){
              /////      System.out.println("Sorry but this book is lent by: ");
             //////   }else{
            /////        book.setStatus(true);
             /////       System.out.println(("You have lent the book"));
            ////    }
                /*if (BookConfiguration.searchBook(Id) != "juan"){

                }*/

             /////   break;
            }else{
                System.out.println("no esta");
                auxName = iter.next().getName();
            }

        }
        return null;
    }
}
