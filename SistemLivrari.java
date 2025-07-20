/*
 * Intr-un oras exista mai multe mijloace de transport ecologic folosite pentru livrari: biciclete, trotinete si drone.
 * O interfata MijlocTransport:
 *      - metoda abstracta void livreaza(String destinatie)
 *      - metoda abstracta double getVitezaMedie()
 *      - metoda abstracta double getCapacitate()
 * 
 * Trei clase care implementeaza interfata:
 *      - Bicicleta: viteza medie 15 km/h, capacitate 10 kg
 *      - Trotineta: viteza medie 20 km/h, capacitate 5 kg
 *      - Drona: viteza medie 50 km/h, capacitate 2 kg
 * 
 * Clasa principala SistemLivrari creeaza obiecte din fiecare clasa si afiseaza:
 *      - tipul, viteza medie, capacitatea maxima
 *      - simuleaza o livrare catre o adresa: "Str. Icoanei nr. 23"
 */

interface MijlocTransport
{
    public abstract void livreaza(String destinatie);
    public abstract double getVitezaMedie();
    public abstract double getCapacitate();

    public static final String TIP_LIVRARE = "ecologic";
}

class Bicicleta implements MijlocTransport
{
    public void livreaza (String destinatie)
    {
        System.out.println("Bicicleta livreaza in mod " + TIP_LIVRARE + " catre " + destinatie);
    }

    public double getVitezaMedie()
    {
        return 15.0;
    }

    public double getCapacitate()
    {
        return 10.0;
    }

    public String toString()
    {
        return "Bicicleta";
    }
}

class Trotineta implements MijlocTransport
{
    public void livreaza(String destinatie)
    {
        System.out.println("Trotineta livreaza in mod " + TIP_LIVRARE + " catre " + destinatie);
    }

    public double getVitezaMedie()
    {
        return 20.0;
    }

    public double getCapacitate()
    {
        return 5.0;
    }

    public String toString()
    {
        return "Trotineta";
    }
}

class Drona implements MijlocTransport
{
    public void livreaza (String destinatie)
    {
        System.out.println("Drona livreaza in mod " + TIP_LIVRARE + " catre " + destinatie);
    }

    public double getVitezaMedie()
    {
        return 50.0;
    }

    public double getCapacitate()
    {
        return 2.0;
    }

    public String toString()
    {
        return "Drona";
    }
}

public class SistemLivrari {
    public static void main(String[] args) {
        MijlocTransport[] flota = {new Bicicleta(), new Trotineta(), new Drona()};

        String destinatie = "Str. Icoanei, nr. 23";

        for (MijlocTransport mijloc : flota)
        {
            System.out.println("-------------------------");
            System.out.println("Tip: " + mijloc);
            System.out.println("Viteza: " + mijloc.getVitezaMedie() + " km/h");
            System.out.println("Capacitate: " + mijloc.getCapacitate() + " kg");
            mijloc.livreaza(destinatie);
        }
    }
}