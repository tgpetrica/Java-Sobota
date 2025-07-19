public class FactorialIterativ {
    public static int factorial(int nr)
    {
        int rezultat = 1;
        for (int i = nr; i > 1; i--)
            rezultat *= i;
        
        return rezultat;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            //System.out.println("Factorial");
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
