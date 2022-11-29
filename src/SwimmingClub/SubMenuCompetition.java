package SwimmingClub;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SubMenuCompetition {
    private int input;
    Scanner sc = new Scanner(System.in);

    public void printMenu(String leadText) {
        System.out.println(leadText);
    }

    public void competitionReaderChoice() {
        try {
            System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - " +
                    "- - - - - - - - - - - - - - - - -- -");
            System.out.println( "  C O M P O T I T I O N");
            System.out.print(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - " +
                    "- - - - - - - - - - - - - -- -");
            printMenu("\n  Choose 1. (Junior team) \n " + " Choose 2. (Senior team)\n  " +
                    "Choose 3  (End session)\n" );
            System.out.print("  Enter:");
            input=sc.nextInt();
            switch (input){

                case 1-> System.out.println("  Junior team");

                case 2-> System.out.println("  Senior team");

                case 3-> System.out.println("  Exit");
                default->
                        System.out.println(" You typed something the system could not understand");
            }

        } catch (InputMismatchException e){
            System.out.println("Warning you wrote something our system dose not contain ");
        }
    }
}

