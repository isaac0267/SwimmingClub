package SwimmingClub;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    void run () throws IOException {
        // Menu menu = new Menu();
        // menu.readerChoice();
        ArrayList<Competitors> createList = new ArrayList<>();
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

