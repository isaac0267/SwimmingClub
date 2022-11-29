package SwimmingClub;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String username;
    String password;

    public User(String firstName, String lastName, String email, String phoneNumber, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = userName;
        this.password = password;
    }

    // method for user login
   public void login() {
       System.out.println("Enter your first name");
       firstName = scanner.nextLine();
       System.out.println("Enter your last name");
       lastName = scanner.nextLine();
       System.out.println("Enter your email");
       email = scanner.nextLine();
       System.out.println("Enter your phoneNumber");
       phoneNumber = scanner.nextLine();
       System.out.println("Enter your username");
       username = scanner.nextLine();
       System.out.println("Enter your password");
       password = scanner.nextLine();

       // print out user info
       System.out.println(firstName);
       System.out.println(lastName);
       System.out.println(email);
       System.out.println(phoneNumber);
       System.out.println(username);
       System.out.println(password);
   }

    // getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void users() {
        // person 1
        setFirstName("Isaac");
        setLastName("Levy");
        setEmail("Isaklevy97@gmail.com");
        setPhoneNumber("81745734");
        setUsername("Isaa0267");
        setPassword("HelloWorld");

        // person 2
        setFirstName("Wei");
        setLastName("Yang");
        setEmail("Wei97@gmail.com");
        setPhoneNumber("7847384334");
        setUsername("Weix0015");
        setPassword("HelloWorld2");

        // person 3
        setFirstName("Hardy");
        setLastName("Akira");
        setEmail("Hardy97@gmail.com");
        setPhoneNumber("34783484734");
        setUsername("Hardy");
        setPassword("HelloWorld3");

        // person 4
        setFirstName("Kirame");
        setLastName("Kisame");
        setEmail("kirame97@gmail.com");
        setPhoneNumber("129382372");
        setPassword("HelloWorld4");
        setUsername("Kirame98");
        setPassword("HelloWorld4");
    }

    @Override
    public String toString() {
        return firstName + lastName + email + phoneNumber + username + password;
    }
}

