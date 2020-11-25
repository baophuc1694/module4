package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("John");
        u1.setPassword("123123");
        u1.setName("Justin Kimberley");
        u1.setEmail("Justin@gmail.com");
        u1.setAge(33);

        User u2 = new User();
        u2.setAccount("KiKi");
        u2.setPassword("123123");
        u2.setName("Lady GaGa");
        u2.setEmail("GaGa@gmail.com");
        u2.setAge(35);

        User u3 = new User();
        u3.setAccount("Taylor");
        u3.setPassword("123123");
        u3.setName("Taylor Switch");
        u3.setEmail("Taylor@gmail.com");
        u3.setAge(33);

        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
