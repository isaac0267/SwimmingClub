package SwimmingClub;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenuMembership {
    private int input;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Competitor> createList = new ArrayList<>();

    Membership membership = new Membership();

    public void printMenu(String leadText) {
        System.out.println(leadText);
    }
    public void membershipReaderChoice(){
        try {
            System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- -");
            System.out.println( "  M E M B E R S H I P");
            System.out.print(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- -");
            printMenu("\n Choose 1. (New membership) \n " + "Choose 2. (Delete membership)\n Choose 3. (Change membership)\n Choose 4 (End session)\n" );
            System.out.print(" Enter:");
            input=sc.nextInt();
            switch (input){

                case 1-> System.out.println(" You choice to create a new member");
                //TODO:FIX LIST
                // membership.CreatMember(createList);


                case 2-> System.out.println(" You choice deleted member");

                case 3->  System.out.println(" You choice change membership");

                case 4-> System.out.println(" Exit");
                default->
                        System.out.println(" You typed something the system could not understand");
            }


        }catch (InputMismatchException e){
            System.out.println("Warning you wrote something that our system do not contain ");
        }

    }


}

