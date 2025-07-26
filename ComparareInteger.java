public class ComparareInteger {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        Integer x = 200;
        Integer y = 200;

        System.out.println("a == b: " + (a == b));

        System.out.println("x == y: " + (x == y));

        // == compara referintele (in memorie verifica daca sunt acelasi obiect)
        // Integer salveaza in cache valorile [-128, 127] (in aceeasi locatie)

        System.out.println("a .equals(b): " + a .equals(b));

        System.out.println("x .equals(y): " + x .equals(y));

        // .equals() compara valorile (valorile numerice sunt identice)

    }
}
