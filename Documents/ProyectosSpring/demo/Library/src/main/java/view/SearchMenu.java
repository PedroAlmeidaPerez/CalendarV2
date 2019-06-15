package view;

import java.util.Scanner;

public class SearchMenu {
    private int option;
    public int selectOption (){
        Scanner scanner = new Scanner(System.in);
        //while (option != 0){
        System.out.println("*-----------Welcome to ATOS Search Menu------------------*");
        System.out.println("  Press 1 Search by tittle: ");
        System.out.println("  Press 2 Search by author: ");
        System.out.println("  Press 3 Search by year: ");
        System.out.println("  Press 4 Search by author and tittle: ");
        System.out.println("  Press 9 to go to Main menu");
        System.out.println("*--------------------------------------------------------*");

        option = scanner.nextInt();
        //}

        return option;
    }
}
