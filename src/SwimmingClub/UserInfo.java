package SwimmingClub;

import java.util.ArrayList;

public class UserInfo {
    //User user = new User("","","","");

    ArrayList<User> userList = new ArrayList<>();
    public void test() {
        userList.add(new User("Isaac", "Levy ", "Isaa0267 ", "HelloWorld\n"));
        userList.add(new User("Wei ", "Yang ", "Weix0015 ", "HelloWorld2\n"));
        userList.add(new User("Hardy ", "Akira ", "Hardy ", "HelloWorld3\n"));
        userList.add(new User("Kirame ", "Kisame ", "Kirame98 ","HelloWorld4"));
    }
    public static void main(String[] args) {
        UserInfo info = new UserInfo();
        User user = new User("Isaac", "Levy", "Isaa0267", "HelloWorld");
        user.login();
        info.test();
    }
}
