public class ComparareBoolean {
    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = true;

        Boolean b3 = new Boolean(true);
        Boolean b4 = new Boolean(true);

        System.out.println("b1 == b2: " + (b1 == b2));

        System.out.println("b3 == b4: " + (b3 == b4));

        // b1, b2 au valorile cache-uite, au acceasi referinta

        System.out.println(b1.equals(b2));
        System.out.println(b3.equals(b4));
    }
}
