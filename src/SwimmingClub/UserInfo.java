package SwimmingClub;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfo {
    //User user = new User("","","","");
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Isaac", "Levy ", "Isaa0267 ", "HelloWorld\n"));
        userList.add(new User("Wei ", "Yang ", "Weix0015 ", "HelloWorld2\n"));
        userList.add(new User("Hardy ", "Akira ", "Hardy ", "HelloWorld3\n"));
        userList.add(new User("Kirame ", "Kisame ", "Kirame98 ","HelloWorld4"));

        Scanner scanner = new Scanner(System.in);
        System.out.println(UserInfo.login(userList, scanner));
    }

    public static User login(ArrayList<User> userList, Scanner scanner){
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Navn: "+input);
        for (int i = 0; i < userList.size(); i++){
            if (userList.get(i).getFirstName()){
                return userList.get(i);
            }
        }
        return null;
    }

}
