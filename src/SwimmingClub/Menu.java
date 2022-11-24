package SwimmingClub;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc=new Scanner(System.in); // make the scanner.
    private String menuHeader;   // make the attributes for making the menu.
    private String menuItem;    // We will use the String as data type.
    private String leadText;
    private int input;
    private boolean beekeeping =true;
    public Menu(){ // The empty constructor, to avoid the problem.

    }
    public Menu(String menuHeader, String menuItem,String leadText)throws IOException {
        this.menuHeader=menuHeader;
        this.menuItem=menuItem;
        this.leadText=leadText;
    }
    public void printMenu(){
        System.out.println(menuHeader);
        System.out.println(menuItem);
        System.out.println(leadText);
    }
    public void readChoice(){
        // use the try and the catch.
        try {
            // we make the while loop.
            printMenu();
            while (beekeeping){
                input=sc.nextInt();
                // make the switch statement.
                switch (input){
                    case 1-> System.out.println("You choice to creat a new member");

                    case 2-> System.out.println("You choice Swim Disciplin");

                    case 3->  System.out.println("You choice Payment");

                    default->
                            System.out.println("You typed something the system could not understand");
                }
            }
            System.out.println("____________________________________________________________");

        }catch (InputMismatchException e){
            System.out.println("Waring you wrote something our system dose not contain ");
        }
    }

}