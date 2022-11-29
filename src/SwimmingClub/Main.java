package SwimmingClub;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static LoginUser user;

    void run () throws IOException {
        // Menu menu = new Menu();
        // menu.readerChoice();
        ArrayList<Competitor> createList = new ArrayList<>();
        Senior ss= new Senior();
        ss.events(createList);
        ss.printSenior(createList);
        Junior jj = new Junior();
        jj.events(createList);
        jj.printJunior(createList);
    }

    public static void createUserMenu() {
        System.out.println("enter username");
        String userName = scan.nextLine();
        System.out.println("enter password");
        String password = scan.nextLine();
        user = new LoginUser(userName, password);
    }

    public static void loginMenu() {
        System.out.println("Do you want to login?");
        System.out.println("enter user");
        String name = scan.nextLine();
        System.out.println("enter password");
        String pass = scan.nextLine();
        if (LoginUser.checkPassword(pass)){
            System.out.println("You are now logged in");
        }
        else{
            System.out.println("wrong info");
        }

    }

    public static void main(String[] args) throws IOException {
        createUserMenu();
        loginMenu();
        new Main().run();
    }
}

