package controller;

import model.Library;
import utils.SearchConfiguration;
import view.Menu;
import view.SearchMenu;

public class SearchController {
    private SearchMenu searchMenu = new SearchMenu();
    private int option;
    Menu menu = new Menu();
    SearchConfiguration searchConfiguration = new SearchConfiguration();

    public SearchController() {
        this.option = searchMenu.selectOption();
    }

    public SearchController(Menu menu) {
        this.option = searchMenu.selectOption();
        this.menu = menu;
        searchOption();
    }

    private void searchOption(){
        //SearchConfiguration searchConfiguration = new SearchConfiguration();
        //this.option = searchMenu.selectOption();
        switch (option) {
            case 1:
                searchConfiguration.searchByTittle();
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 2:
                searchConfiguration.searchByAuthor();
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 3:
                searchConfiguration.searchByYear();
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 4:
                searchConfiguration.searchByAuthorAndTittle();
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 9:
                new LibraryController();
                break;

             default:
                System.out.println("This option is not valid");
                this.option = searchMenu.selectOption();
                searchOption();
                break;
        }
    }
}
