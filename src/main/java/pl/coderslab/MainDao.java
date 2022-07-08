package pl.coderslab;

import java.util.Scanner;

public class MainDao {
    public static void main(String[] args) {
        menu();
        UserDao userDao = new UserDao();
        User user = new User();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            switch (input) {
                case "all":
                    User[] all = userDao.findAll();
                    for (User u : all) {
                        System.out.println(user.toString(u));
                    }
                    break;
                case "user":
                    System.out.println("Type id of user you wish to see: ");
                    int user_id = sc.nextInt();
                    User read = userDao.read(user_id);
                    System.out.println(user.toString(read));
                    break;
                case "add":
                    System.out.println("Set user name: ");
                    String name = sc.nextLine();
                    user.setUserName(name);

                    System.out.println("Set email: ");
                    String email = sc.nextLine();
                    user.setEmail(email);

                    System.out.println("Set password: ");
                    String pass = sc.nextLine();
                    user.setPassword(pass);

                    userDao.create(user);
                    break;
                case "remove":
                    System.out.println("Type id of user you want to remove");
                    int remove_id = sc.nextInt();
                    userDao.delete(remove_id);
                    break;
                case "update":
                    System.out.println("Type id of user you want to update");
                    int update_id = sc.nextInt();
                    User userToUpdate = userDao.read(update_id);

                    System.out.println("Set user name: ");
                    Scanner nameHelper = new Scanner(System.in);
                    String uName = nameHelper.nextLine();
                    userToUpdate.setUserName(uName);

                    System.out.println("Set email: ");
                    Scanner emailHelper = new Scanner(System.in);
                    String uEmail = emailHelper.nextLine();
                    userToUpdate.setEmail(uEmail);

                    System.out.println("Set password: ");
                    Scanner passHelper = new Scanner(System.in);
                    String uPass = passHelper.nextLine();
                    userToUpdate.setPassword(uPass);

                    userDao.update(userToUpdate);
                    break;
                case "exit":
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
            }
            System.out.println();
            menuReturn();
        }
        sc.close();
    }

    public static void menu() {
        System.out.println("Welcome to database of users. What do you want to do?");
        System.out.println("To see all users type: all");
        System.out.println("To see specific users type:  user");
        System.out.println("To create user type: add");
        System.out.println("To delete user type: remove");
        System.out.println("To alter user type: update ");
    }

    public static void menuReturn() {
        System.out.println("What do you want to do?");
        System.out.println("Options: 'all', 'user', 'add', 'remove', 'update'");
    }
}
