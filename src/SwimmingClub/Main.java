package SwimmingClub;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    void run () throws IOException {
        //    Menu menu = new Menu();
        // menu.readerChoice();
        ArrayList<Competitors> lavedListee = new ArrayList<>();
        Senior ss= new Senior();
        ss.events(lavedListee);
        ss.printSenior(lavedListee);
        Junior jj = new Junior();
        jj.events(lavedListee);
        jj.printJunior(lavedListee);
    }
    public static void main(String[] args) throws IOException {
        new Main().run();

    }
}

