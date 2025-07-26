import java.util.Objects;
public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User toBeChecked = (User) o;
        return id == toBeChecked.id 
                && Objects.equals(name, toBeChecked.name)
                && Objects.equals(email, toBeChecked.email);
    }

    public int hashCode()
    {
        return Objects.hash(id, name, email);
    }

    public String toString()
    {
        return "User{id: " + id + ", name: " + name + ", email: " + email + "}";
    }
}
