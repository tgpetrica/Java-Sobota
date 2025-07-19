public class FactorialRecursiv {
    public static int factorial(int nr)
    {
        if (nr <= 1)
            return 1;
        return nr * factorial(nr - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            //System.out.println("Factorial");
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
