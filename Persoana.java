public class Persoana {
    String nume;
    int varsta;

    /*
     * In procesul de compilare, daca nu a fost declarat un constructor,
     * Compilatorul defineste un constructor implicit (default), 
     * constructor fara parametri
     */

    // constructor implicit 
    public Persoana () {
        this.nume = "Anonim";
        this.varsta = 0;
    }

    // constructor cu un parametru
    public Persoana (String nume) {
        this.nume = nume;
        this.varsta = 0;
    }

    // constructor cu doi parametri
    public Persoana (String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // constructorul de copiere
    public Persoana (Persoana p) {
        this.nume = p.nume;
        this.varsta = p.varsta;
    }

    // constructor privat (Singleton)
    private Persoana(boolean s) {
        this.nume = "Singleton Person";
        this.varsta = 100;
    }

    private static Persoana instanta = null;

    public static Persoana getInstanta() {
        if (instanta == null) {
            instanta = new Persoana(true);
        }
        return instanta;
    }

    public String toString() {
        return "Persoana{nume = " + nume + ", varsta = " + varsta + "}";
    }

    public static void main(String[] args) {
        /*
        Persoana p1 = new Persoana();
        System.out.println(p1);
        Persoana p2 = new Persoana("Marian");
        System.out.println(p2);
        Persoana p3 = new Persoana("Ioana", 20);
        System.out.println(p3);
        Persoana p4 = new Persoana(p3);
        System.out.println(p4);
        Persoana ps = new Persoana().getInstanta();
        System.out.println(ps);
        */

        if (args.length == 0) {
            System.out.println("Nu ai transmis argumente.");
            Persoana p = new Persoana();
            System.out.println(p);
        } 
        else if (args.length == 1) {
            String nume = args[0];
            Persoana p = new Persoana(nume);
            System.out.println("A fost transmis un singur argument.");
            System.out.println(p);
        }
        else if (args.length >= 2) {
            String nume = args[0];
            int varsta = Integer.parseInt(args[1]);
            Persoana p = new Persoana(nume, varsta);
            System.out.println("Au fost transmise doua argumente.");
            System.out.println(p);
        }
    }
}