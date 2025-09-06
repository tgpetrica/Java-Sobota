package ReteaSociala;

import java.util.HashMap;
import java.util.Map;

public class Computer 
{
    public Map <String, Database.User> users = new HashMap<>();

    public void connectTo(String username, String password)
    {
        Database db = Database.getInstance();
        String stored = db.credentials.get(username);

        if(stored != null && stored.equals(password))
        {
            Database.User user = db.createUserFrom(username);
            if (user != null)
            {
                users.put(username, user);
                System.out.println("Computer >> Connected: " + username);
                return;
            }
        }
        System.out.println("Computer >> Connection failed for: " + username);
    }

    public void disconnect(String username)
    {
        if (users.remove(username) == null)
        {
            System.out.println("Computer >> No session for: " + username);
        } else {
            System.out.println("Computer >> Disconnected: " + username);
        }
    }
}
