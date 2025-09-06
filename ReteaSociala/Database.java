package ReteaSociala;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Database 
{
    private Database() {}
    private static final Database instance = new Database();
    public static Database getInstance()
    {
        return instance;
    }

    public Map<String, String> credentials = new HashMap<>();
    public Map<String, Map<String, String>> data = new HashMap<>();

    public static class User 
    {
        public String name;
        public Map<String, String> data;

        private User(String name, Map<String, String> data)
        {
            this.name = name;
            this.data = (data == null) ? new HashMap<>() : new HashMap<>(data);
        }

        public void sayTo(String otherUser, String message)
        {
            System.out.println("DM >>" + name + " -> " + otherUser + ": " + message);
        }
    }

    public Database.User createUserFrom(String username)
    {
        Map<String, String> userData = data.get(username);
        if (userData == null)
        {
            return null;
        }
        return new Database.User(username, userData);
    }
}
