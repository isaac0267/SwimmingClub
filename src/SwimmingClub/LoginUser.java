package SwimmingClub;

import java.util.Scanner;

public class LoginUser {
    // Making attributes for userName and password, yes_or_no, scan and the last attribute is passScan.
    String userName;
    String password;
    String yes_or_no;
    String scann;
    String passScan;
    Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    Scanner ask = new Scanner(System.in);

    // Method for the password.

    public LoginUser(String userName, String   password){
        this.userName = userName;
        this.password = password;
    }

    public void setUserName() {
        // Making the Scan.
        // make another scanner and give it an object call it name.

        String userName = scan.nextLine();
        this.userName = userName;

        Scanner name = new Scanner(System.in);
        System.out.println("Username");
        this.userName = name.next().toLowerCase(); // give the user the option to enter the username.

    }
    // Method for the password.
    public void setPassword() {
        // I will make the other Scanner. In this Scanner I will use the same logic, that I used in the username.
        Scanner pass = new Scanner(System.in);
        System.out.println("Password");
        password = pass.next().toLowerCase();
        System.out.println("You are successful logge in"); // Maybe I can make a method,just for this statement.

    }

    public static boolean checkPassword(String password){
        return password.equals("myPassword");
    }

    // I will make the other Method just for the ask.
    public void ask() {
        System.out.println("Do you want to check this or not( yes or no)");
        yes_or_no = ask.next().toLowerCase();

    }







    

}
