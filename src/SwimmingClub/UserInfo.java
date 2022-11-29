package SwimmingClub;

import java.util.ArrayList;

public class UserInfo {

    ArrayList<User> userList = new ArrayList<>();
    public void test() {
        userList.add(new User("Isaac ", "Levy ", "Isaklevy97@gmail.com ",
                "81745734 ", "Isaa0267 ", "HelloWorld\n"));
        userList.add(new User("Wei ", "Yang ", "Wei97@gmail.com ", "784784334 ",
                "Weix0015 ", "HelloWorld2\n"));
        userList.add(new User("Hardy ", "Akira ", "Hardy97@gmail.com ",
                "34783484734 ", "Hardy ", "HelloWorld3\n"));
        userList.add(new User("Kirame ", "Kisame ","kirame972gmail.com ",
                "129382372 ", "Kirame98 ","HelloWorld4"));
    }
    public static void main(String[] args) {
        UserInfo info = new UserInfo();
        info.test();
        System.out.println(info.userList);

    }
}
