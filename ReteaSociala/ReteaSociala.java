package ReteaSociala;

public class ReteaSociala {
    public static void main(String[] args) {
        Person teodor = new Person();
        Computer device = new Computer();

        teodor.info.put ("name", "Teodor");
        teodor.info.put ("job", "Junior Java Developer");
        teodor.info.put ("yob", "2002");
        teodor.info.put ("greeting", "Hey, my name is Teodor.");

        AuthSystem.register(teodor, "tgpetrica", "password1234");
        device.connectTo("tgpetrica", "password1234");

        Database.User teoUser = device.users.get("tgpetrica");

        if (teoUser != null)
        {
            teoUser.sayTo("alex12", "Hello!");
            teoUser.sayTo("Sorina", teoUser.data.get("greeting"));
            device.disconnect("tgpetrica");
        }
    }
}
