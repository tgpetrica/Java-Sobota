import java.util.*;

public class TablouriUnidimensionale {
    /*
     * Citim o valoare de la tastatura: n;
     * - citim un vector de n elemente
     * - afisam suma celor pozitive
     * - afisam minim, maxim
     * - cream un nou vector care are elementele negative din vectorul inital
     * - determinam de cate ori apare fiecare numar din vector in vector
     * - sortare (bubble, selection)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] vector = getVector(sc, n);

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("Suma numerelor pozitive este: " + sumaPozitive(vector));
        int[] minMax = calculeazaMinMax(vector);
        System.out.println("Valoarea minima: " + minMax[0]);
        System.out.println("Valoarea maxima: " + minMax[1]);

        System.out.print("Vector negativ: ");
        int[] negativ = negative(vector);
        for (int i = 0; i < negativ.length; i++) {
            System.out.print(negativ[i] + " ");
        }
        System.out.println();

        Map <Integer, Integer> frecvente = frecvente(vector);
        System.out.println("Frecventa elementelor: " + frecvente);
    }


    public static int[] getVector(Scanner scanner, int marime) {
        System.out.println("Introdu o serie de numere in formatul: a, b, c");
        String linie = scanner.nextLine();
        String[] elemente = linie.split(", ");
        if (elemente.length != marime) {
            System.out.println("Vectorul nu are marimea egala cu " + marime);
            System.exit(0);
        }
        int[] vector = new int[elemente.length];
        for (int i = 0; i < elemente.length; i++) {
            try {
                vector[i] = Integer.parseInt(elemente[i]);
            } catch (NumberFormatException e) {
                System.out.println("Introdu numere intregi!");
            }
        }
        return vector;
    }

    public static int sumaPozitive(int[] v){
        int suma = 0;
        for(int a : v){
            if (a > 0) suma += a;
        }
        return suma;
    }

    public static int[] calculeazaMinMax(int[]v){
        int minim = Integer.MAX_VALUE;
        int maxim = Integer.MIN_VALUE;

        for(int a : v){
            if(a < minim) minim = a;
            if(a > maxim) maxim = a;
        }
    
        return new int[]{minim, maxim};
    }

    public static int[] negative(int[] v) {
        int [] n = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 0) n[i] = v[i];
            else n[i] = -v[i];
        }
        return n;
    }

    public static Map<Integer, Integer> frecvente (int[] v) {
        Map<Integer, Integer> map = new HashMap();

        for (int i : v) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}