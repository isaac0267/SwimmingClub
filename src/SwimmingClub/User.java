package SwimmingClub;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    UserInfo userInfo = new UserInfo();
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;
    String username;
    String password;
    boolean checkLogin;

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = userName;
        this.password = password;
    }

    // method for user login
    public void login() {
        String nameBooking = "";
        System.out.println("Enter your first name");

        nameBooking = scanner.nextLine();
        //Loop through ArrayList

       for (int i = 0; i < UserInfo.userList.size(); i++) {
           userInfo.test();
            if (UserInfo.userList.get(i).firstName.equals(nameBooking)) {
                System.out.println("You entered the right name");
            }
        }

        }

    // getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void users() {
        // person 1



    }

    @Override
    public String toString() {
        return firstName + lastName + username + password;
    }
}

