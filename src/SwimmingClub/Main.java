package SwimmingClub;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static User user;

    void run () throws IOException {
        ArrayList<Competitor> createList = new ArrayList<>();
        Senior ss= new Senior();
        ss.events(createList);
        ss.printSenior(createList);
        Junior jj = new Junior();
        jj.events(createList);
        jj.printJunior(createList);
    }





    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}

