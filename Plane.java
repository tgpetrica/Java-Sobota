import java.util.ArrayList;
import java.util.List;

abstract class MainComponent
{
    public abstract String getName();
}

public class Plane {
    private static final int IS_BUILT   = 0b001;
    private static final int IS_DAMAGED = 0b010;
    private static final int HAS_FUEL   = 0b100;

    private int status = 0;

    private List<MainComponent> components = new ArrayList<>();

    public void addFuel()
    {
        status = status | HAS_FUEL;
        System.out.println("Fuel has been added.");
        System.out.println("Status: " + Integer.toBinaryString(status));
    }

    public void repair()
    {
        status = status & ~IS_DAMAGED;
        System.out.println("Repaired.");
        System.out.println("Status: " + Integer.toBinaryString(status));
    }

    public void build()
    {
        status |= IS_BUILT;
        System.out.println("Built.");
        System.out.println("Status: " + Integer.toBinaryString(status));

        class Fuselage extends MainComponent
        {
            public String getName() {return "Fuselage";}
        }

        class Wing extends MainComponent
        {
            public String getName() {return "Wing";}
        }

        class Empennage extends MainComponent
        {
            public String getName() {return "Empennage";}
        }

        components.add(new Fuselage());
        components.add(new Wing());
        components.add(new Empennage());
    }

    public boolean isBuilt()
    {
        return (status & IS_BUILT) == IS_BUILT;
    }

    public boolean isDamaged()
    {
        return (status & IS_DAMAGED) == IS_DAMAGED;
    }

    public boolean hasFuel()
    {
        return (status & HAS_FUEL) == HAS_FUEL;
    }

    public void listComponents()
    {
        System.out.println("Components: ");
        for (MainComponent c : components)
        {
            System.out.println(c.getName());
        }
    }

    public static void main(String[] args)
    {
        Plane plane = new Plane();
        
        plane.build();
        plane.addFuel();
        plane.repair();
        
        System.out.println("Built? " + plane.isBuilt());
        System.out.println("Has fuel? " + plane.hasFuel());
        System.out.println("Damaged? " + plane.isDamaged());
        
        plane.listComponents();
    }
}


