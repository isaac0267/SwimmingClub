package SwimmingClub;

import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
        new Main().run();

    }
    void run() throws IOException {
        Menu menu2=new Menu("|Welcome to our Swim club|\n" +
                "| 1- Create a new User  |\n" +
                "| 2- Swim Discipline    |\n" +
                "| 3- Payment            |\n", "you can choice:\n","| 1- Create a new User  |\n"+
                "| 2- Swim Discipline    |\n" + "| 3- Payment            |\n"
        );
        menu2.readChoice();
    }
}