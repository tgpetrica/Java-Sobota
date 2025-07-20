abstract class Shape {
    public abstract String getNume();
    public abstract double getPerimetru(double latura);
    public abstract double getArie(double latura);

    public void afisare(double latura) {
        System.out.println ("Forma: " + getNume());
        System.out.println ("Perimetru: " + getPerimetru(latura));
        System.out.println ("Aria: " + getArie(latura));
    }
}

class Patrat extends Shape {
    public String getNume() {
        return "Patrat";
    }

    public double getPerimetru(double dimensiune) {
        return 4 * dimensiune;
    }

    public double getArie (double dimensiune) {
        return dimensiune * dimensiune;
    }
}

class Dreptunghi extends Shape {
    private double lungime;

    public Dreptunghi (double lungime) {
        this.lungime = lungime;
    }

    public String getNume() {
        return "Dreptunghi";
    }

    public double getPerimetru(double latime) {
        return 2 * (lungime + latime);
    }

    public double getArie (double latime) {
        return lungime * latime;
    }

    public boolean estePatrat (double latime) {
        return lungime == latime;
    }
}

class Cerc extends Shape {
    public String getNume() {
        return "Cerc";
    }

    public double getPerimetru (double raza) {
        return 2 * raza * Math.PI;
    }

    public double getArie (double raza) {
        return raza  * raza * Math.PI;
    }
}

public class AbstractizareShape {
    public static void main(String[] args) {
        double dimensiune = 7.54;

        Shape forma = new Patrat();
        forma.afisare(dimensiune);

        Shape figura = new Cerc();
        figura.afisare(dimensiune);

        Shape fig = new Dreptunghi(12.0);
        fig.afisare(dimensiune);
        if (fig instanceof Dreptunghi) {
            boolean estePatrat = ((Dreptunghi) fig).estePatrat(11.0);
            System.out.println("Este patrat? " + (estePatrat ? "Da" : "Nu"));
        }
    }
}