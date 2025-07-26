import java.util.HashSet;

public class UserApp {
    public static void main(String[] args) {
        User u1 = new User(1, "Andreea", "andreea@mail.ro");
        User u2 = new User(2, "Bianca", "bianca@mail.ro");
        User u3 = new User(3, "Camelia", "camelia@mail.ro");
        User u4 = new User(2, "Bianca", "bianca@mail.ro");
        User u5 = new User(5, "Emilia", "emilia@mail.ro");

        System.out.println("u1 == u3: " + u1.equals(u3));
        System.out.println("u2 == u4: " + u2.equals(u4));

        HashSet<User> users = new HashSet<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        System.out.println("Users list:");
        for (User u : users)
        {
            System.out.println(u);
        }
    }
}
