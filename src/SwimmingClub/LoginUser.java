package SwimmingClub;

import java.util.Scanner;

public class LoginUser {
    // Making attributes for userName and password, yes_or_no, scan and the last attribute is passScan.
    String userName;
    String password;


    public LoginUser(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public static boolean checkPassword(String password){
        return password.equals("myPassword");
    }
}
