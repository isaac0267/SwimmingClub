package SwimmingClub;

import java.util.ArrayList;

public class UserInfo {

    ArrayList<User> userList = new ArrayList<>();
    public void test() {
        userList.add(new User("Isaac", "Levy", "Isaklevy97@gmail.com",
                "81745734", "Isaa0267", "HelloWorld"));
        userList.add(new User("Wei", "Yang", "Wei97@gmail.com", "784784334",
                "Weix0015", "HelloWorld2"));
        userList.add(new User("Hardy", "Akira", "Hardy97@gmail.com", "34783484734",
                "Hardy", "HelloWorld3"));
    }
    public static void main(String[] args) {

    }
}
