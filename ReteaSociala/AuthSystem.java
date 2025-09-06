package ReteaSociala;

public class AuthSystem 
{
    public static void register(Person person, String username, String password)
    {
        Database db = Database.getInstance();
        db.credentials.put(username, password);
        db.data.put(username, person.info);
        System.out.println("Auth >> Registered user: " + username);
    }
}
