interface PoligonRegulat
{
    public abstract int getNumSides();
    public abstract double getSideLength();
    public static final int MIN_SIDES = 3;
}

class TriunghiEchilateral implements PoligonRegulat 
{
    private double sideLength;

    public TriunghiEchilateral(double sideLength)
    {
        this.sideLength = sideLength;
    }

    public int getNumSides()
    {
        return 3;
    }

    public double getSideLength()
    {
        return sideLength;
    }
}

class Patrat implements PoligonRegulat
{
    private double sideLength;

    public Patrat(double sideLength)
    {
        this.sideLength = sideLength;
    }

    public int getNumSides()
    {
        return 4;
    }

    public double getSideLength()
    {
        return sideLength;
    }
}


public class Poligonul {
    public static void main(String[] args) {
        PoligonRegulat triunghi = new TriunghiEchilateral(5.0);
        PoligonRegulat patrat   = new Patrat(7.0);

        System.out.println("Triunghi echilateral");
        System.out.println("Laturi: " + triunghi.getNumSides());
        System.out.println("Lungime latura: " + triunghi.getSideLength());
        System.out.println("Perimetru: " + 3 * triunghi.getSideLength());
        System.out.println("Arie: " + Math.pow(triunghi.getSideLength(), 2) * Math.sqrt(3) / 4);

        System.out.println("\n");

        System.out.println("Patrat");
        System.out.println("Laturi: " + patrat.getNumSides());
        System.out.println("Lungime latura: " + patrat.getSideLength());
        System.out.println("Perimetru: " + 4 * patrat.getSideLength());
        System.out.println("Arie: " + Math.pow(patrat.getSideLength(), 2));
    }
}