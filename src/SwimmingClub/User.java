package SwimmingClub;

public class User {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String userName;
    String password;


    public User(String firstName, String lastName, String email, String phoneNumber,
                String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
    }

    // getter.
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
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }


    public boolean checkPassword(String password) {
        return password.equals("myPassword");
    }
}

