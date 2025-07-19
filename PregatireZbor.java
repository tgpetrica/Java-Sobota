// verificarea combustibilului incarcat la bord
// pilotii sunt la bord
// usile avionului sunt inchise
// mtow check
// sistemele avionului (AP, hidraulic, motoare, etc) sunt functionale
// verificarea conditiilor meteorologice
// presiunea din pneuri
// depunerea planului de zbor
// autorizatia ATC

import java.lang.reflect.Executable;

class FuelException extends Exception
{
    private final int fuelLevel;

    public FuelException(int fuelLevel)
    {
        super ("Combustibil insuficient: " + fuelLevel + "% (minim 30%).");
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel()
    {
        return fuelLevel;
    }
}

class PilotAbsenceException extends Exception
{
    public PilotAbsenceException()
    {
        super("Pilotii nu sunt prezenti in carlinga.");
    }
}

class DoorsOpenException extends Exception
{
    public DoorsOpenException()
    {
        super ("Una sau mai multe usi ale avionului sunt deschise.");
    }
}

class OverweightException extends Exception
{
    private final int currentWeight;
    private final int maxWeight;

    public OverweightException(int currentWeight, int maxWeight)
    {
        super ("Greutatea avionului este " + currentWeight + " t, depasind limita de " + maxWeight + "t.");
        this.currentWeight = currentWeight;
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight()
    {
        return currentWeight;
    }

    public int getMaxWeight()
    {
        return maxWeight;
    }
}

class AircraftSystemsException extends Exception
{
    public AircraftSystemsException()
    {
        super ("Cel putin unul dintre sistemele avionului (AP, hidraulice, motoare) nu functioneaza in parametri normali.");
    }
}

class WeatherException extends Exception
{
    public WeatherException()
    {
        super ("Conditiile meteorologice sunt neprielnice zborului.");
    }
}

class LowTirePressureException extends Exception
{
    private final int pressure;

    public LowTirePressureException(int pressure)
    {
        super ("Presiunea in pneuri este " + pressure + "psi.");
        this.pressure = pressure;
    }

    public int getPressure()
    {
        return pressure;
    }
}

class FPLNotFilledException extends Exception
{
    public FPLNotFilledException()
    {
        super ("Nu s-a depus un plan de zbor.");
    }
}

class ATCNotClearedException extends Exception
{
    public ATCNotClearedException()
    {
        super ("Nu s-a primit autorizatia de zbor ATC.");
    }
}

class Avion
{
    private boolean     pilotPresent;
    private boolean     doorsClosed;
    private int         fuelLevel;
    private int         totalWeight;
    private boolean     systemsOK;
    private int         tirePressure;
    private boolean     weatherChecked;
    private boolean     FPLFilled;
    private boolean     ATCCleared;

    private static final int MTOW = 75000;
    private static final int MIN_TIRE_PRESSURE = 200;

    public Avion(boolean pilotPresent, boolean doorsClosed, int fuelLevel, int totalWeight, boolean systemsOK,
                    int tirePressure, boolean weatherChecked, boolean FPLFilled, boolean ATCCleared)
    {
        this.pilotPresent = pilotPresent;
        this.doorsClosed = doorsClosed;
        this.fuelLevel = fuelLevel;
        this.totalWeight = totalWeight;
        this.systemsOK = systemsOK;
        this.tirePressure = tirePressure;
        this.weatherChecked = weatherChecked;
        this.FPLFilled = FPLFilled;
        this.ATCCleared = ATCCleared;
    }
    
    public void pregatireAeronava() throws FuelException, PilotAbsenceException, DoorsOpenException,
                                OverweightException, AircraftSystemsException, WeatherException,
                                LowTirePressureException, FPLNotFilledException, ATCNotClearedException
    {
        if (fuelLevel < 30)
            throw new FuelException(fuelLevel);
        
        if (!pilotPresent)
            throw new PilotAbsenceException();
        
        if (!doorsClosed)
            throw new DoorsOpenException();
        
        if (totalWeight > MTOW)
            throw new OverweightException(totalWeight, MTOW);
        
        if (!systemsOK)
            throw new AircraftSystemsException();
        
        if (tirePressure < MIN_TIRE_PRESSURE)
            throw new LowTirePressureException(tirePressure);
        
        if (!weatherChecked)
            throw new WeatherException();
        
        if (!FPLFilled)
            throw new FPLNotFilledException();
        
        if (!ATCCleared)
            throw new ATCNotClearedException();
        
        System.out.println("Avionul este pregatit pentru zbor.");
    }
}

public class PregatireZbor {
    public static void main(String[] args) {
        Avion ROT123 = new Avion(true, true, 45, 28000, true, 210, true, true, true);

        try 
        {
            executaVerificare(ROT123);
        } catch (Exception e) 
        {
            System.out.println("Au fost identificate urmatoarele probleme: ");
            System.out.println(e.getMessage());
        }

    }

    public static void executaVerificare(Avion a) throws FuelException, PilotAbsenceException, DoorsOpenException,
                                OverweightException, AircraftSystemsException, WeatherException,
                                LowTirePressureException, FPLNotFilledException, ATCNotClearedException
    {
        a.pregatireAeronava();
    }
}
