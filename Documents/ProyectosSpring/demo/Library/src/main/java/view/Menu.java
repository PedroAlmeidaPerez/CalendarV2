package view;

import java.util.Scanner;

public class Menu {
    private int option;

    public  int selectOption (){
        Scanner scanner = new Scanner(System.in);
        //while (option != 0){
            System.out.println("*-----------Welcome to ATOS Main Menu library-----------*");
            System.out.println("  Press 1 to add a Client: ");
            System.out.println("  Press 2 to add a Book: ");
            System.out.println("  Press 3 to delete a Book: ");
            System.out.println("  Press 4 to rent a Book: ");
            System.out.println("  Press 5 to show Books: ");
            System.out.println("  Press 6 to Search Book: ");
            System.out.println("  Press 0 to exit the application");
            System.out.println("*--------------------------------------------------------*");

            option = scanner.nextInt();
        //}

        return option;
    }
}
