package SwimmingClub;

public class User {
    // Making attributes for userName and password, yes_or_no, scan and the last attribute is passScan.
    String userName;
    String password;


    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public  boolean checkPassword(String password){
        return password.equals("myPassword");
    }
}
