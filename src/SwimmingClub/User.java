package SwimmingClub;

public class User {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String userName;
    String password;

    public User(String firstName, String lastName, String email, String phoneNumber, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
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

    public String getUserName() {
        return userName;
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

    public void setUserName(String userName) {
        this.userName = userName;
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
        setUserName("Isaa0267");
        setPassword("HelloWorld");

        // person 2
        setFirstName("Wei");
        setLastName("Yang");
        setEmail("Wei97@gmail.com");
        setPhoneNumber("7847384334");
        setUserName("Weix0015");
        setPassword("HelloWorld2");

        // person 3
        setFirstName("Hardy");
        setLastName("Akira");
        setEmail("Hardy97@gmail.com");
        setPhoneNumber("34783484734");
        setUserName("Hardy");
        setPassword("HelloWorld3");

        // person 4
        setFirstName("Kirame");
        setLastName("Kisame");
        setEmail("kirame97@gmail.com");
        setPhoneNumber("129382372");
        setPassword("HelloWorld4");
        setUserName("Kirame98");
        setPassword("HelloWorld4");

    }

    @Override
    public String toString() {
        return firstName + lastName + email + password;
    }
}

