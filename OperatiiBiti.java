public class OperatiiBiti {
    public static void main(String[] args) {
        byte a = 13;
        byte b = 17;
        System.out.println(a + "&" + b + " = " + (a&b));

        a = 5;
        b = 7;

        System.out.println(a + "&" + b + " = " + (a&b));

        a = 8;
        b = 4;

        System.out.println(a + "|" + b + " = " + (a|b));

        a = 9;
        b = 11;

        System.out.println(a + "|" + b + " = " + (a|b));

        a = 13;
        b = 14;

        System.out.println(a + "^" + b + " = " + (a^b));

        a = 3;
        b = 18;

        System.out.println(a + "^" + b + " = " + (a^b));

        byte c = 27;

        System.out.println("~" + c + " = " + (~c));

        System.out.println();

        byte x = 8;

        System.out.println(x + "<<" + 2 + " = " + (x << 2));

        x = 7;

        System.out.println(x + "<<" + 3 + " = " + (x << 3));

        System.out.println(x + ">>" + 2 + " = " + (x >> 2));

        byte y = -14;

        System.out.println(y + ">>>" + 2 + " = " + (-14 >>> 2));
    }
}
