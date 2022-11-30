package SwimmingClub;

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

/*
    // method for user login
    public void login() {
        String nameBooking = "";
        System.out.println("Enter your first name");
        String input = scanner.nextLine();
       // nameBooking = scanner.nextLine();
        //Loop through ArrayList

            if (userList.contains(input)) {
                System.out.println("its logged in");
            }

        System.out.println(userInfo.userList.get(0).firstName);
       for (int i = 0; i < userList.size(); i++) {

            if (userList.get(i).firstName.equals(nameBooking)) {
                System.out.println("You entered the right name");
            }
        }

        }
        /*
 */

    // getter


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

