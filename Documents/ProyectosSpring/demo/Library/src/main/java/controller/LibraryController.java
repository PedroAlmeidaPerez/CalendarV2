package controller;

import model.Book;
import model.Library;
import model.Person;
import utils.BookConfiguration;
import utils.PersonConfiguration;
import utils.SearchConfiguration;
import view.Menu;
import view.SearchMenu;

import java.util.Scanner;

public class LibraryController {
    private Menu menu = new Menu();
    private int option;
    private SearchMenu searchMenu = new SearchMenu();


    public LibraryController() {
        //Menu menu = new Menu();
        Library library = new Library();
        this.option = menu.selectOption();
        mainMenu();
    }

    private void mainMenu() {
      //  this.option = menu.selectOption();
       // Menu menu = new Menu ();
        switch (option) {
            case 1:
                System.out.println("estas en la opcion 1");
                PersonConfiguration.addPersons();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 2:
                System.out.println("estas en la opcion 2");
                BookConfiguration.addBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 3:
                System.out.println("Estas en la opcion 3");
                BookConfiguration.deleteBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 4:
                Person person;
                System.out.println("Estas en la opcion 4");
                person = PersonConfiguration.searchPerson();
                if (person != null){
                    BookConfiguration.lentBook(person);
                    this.option = menu.selectOption();
                    mainMenu();
                    break;
                }else{
                    System.out.println("This Client does not exist");
                    BookConfiguration.lentBook(person);
                }

            case 5:
                Book.showBooks();
                BookConfiguration.booksAvailable();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 6:
                SearchController searchController = new SearchController(menu);
                break;
                //searchMenu();
            case 0:
                break;
            default:
                System.out.println("This option is not valid");
                this.option = menu.selectOption();
                mainMenu();
                break;
        }
    }
    


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}