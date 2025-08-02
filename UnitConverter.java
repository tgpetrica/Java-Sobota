import java.util.Scanner;

interface Converter<T, U>
{
    U convert(T input);
}

/*
 * 1 ft = 0.3048 m
 * 1 lb = 0.4535 kg
 * 1 inHg = 33.8639 hPa
 * 1 hPa = 25.4 mmHg
 * F = C * 9/5 + 32
 * C = (F - 32) * 5/9
*/

class MeterToFootConverter implements Converter<Double, Double>
{
    public Double convert(Double meters)
    {
        return meters / 0.3048;
    }
}

class FootToMeterConverter implements Converter<Double, Double>
{
    public Double convert(Double feet)
    {
        return feet * 0.3048;
    }
}

class KgToPoundConverter implements Converter<Double, Double>
{
    public Double convert(Double kg)
    {
        return kg / 0.4535;
    }
}

class PoundToKgConverter implements Converter<Double, Double>
{
    public Double convert(Double lb)
    {
        return lb * 0.4535;
    }
}

class CelsiusToFahrenheitConverter implements Converter<Double, Double>
{
    public Double convert(Double C)
    {
        return C * 9 / 5 + 32;
    }
}

class FahrenheitToCelsiusConverter implements Converter<Double, Double>
{
    public Double convert(Double F)
    {
        return (F - 32) * 5 / 9;
    }
}

class inchHgToHpaConverter implements Converter<Double, Double>
{
    public Double convert(Double inchHg)
    {
        return inchHg * 33.8639;
    }
}

class HpaToMmHgConverter implements Converter<Double, Double>
{
    public Double convert(Double hPa)
    {
        return hPa * 25.4;
    }
}

enum UnitCategory
{
    LENGTH, WEIGHT, TEMPERATURE, PRESSURE
}

enum LengthUnit
{
    METER, FOOT
}

enum WeightUnit
{
    KILOGRAM, POUND
}

enum TemperatureUnit
{
    CELSIUS, FAHRENHEIT
}

enum PressureUnit
{
    HPA, INHG, MMHG
}

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose unit category: ");
        System.out.println("1   Length");
        System.out.println("2   Weight");
        System.out.println("3   Temperature");
        System.out.println("4   Air pressure");
        System.out.print("Your option: ");

        int option = sc.nextInt();

        System.out.print("Value: ");
        double value = sc.nextDouble();

        double result = 0.0;
        
        String from = "", to = "";

        switch (option) 
        {
            case 1:
                System.out.println("1   m > ft\n2   ft > m");
                int Lopt = sc.nextInt();
                if (Lopt == 1)
                {
                    result = new MeterToFootConverter().convert(value);
                    from = "m";
                    to = "ft";
                } else {
                    result = new FootToMeterConverter().convert(value);
                    from  = "ft";
                    to = "m";
                }
                break;
            
            case 2:
                System.out.println("1   kg > lb\n2  lb > kg");
                int Wopt = sc.nextInt();
                if (Wopt == 1)
                {
                    result = new KgToPoundConverter().convert(value);
                    from = "kg";
                    to = "lb";
                } else {
                    result = new PoundToKgConverter().convert(value);
                    from = "lb";
                    to = "kg";
                }
                break;
            
            case 3:
                // temperature converter logic
                break;
            
            case 4:
                // air pressure converter logic
                break;
            
            default:
                System.out.println("Invalid option.");
                sc.close();
                return;
                 
        }

        System.out.printf("%.2f %s = %.2f %s\n", value, from, result, to);
        sc.close();
    }
}
