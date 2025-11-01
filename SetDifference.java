import java.util.HashSet;
public class SetDifference {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(3);
        primeNumbers.add(2);

        System.out.println("Numbers: " + numbers);
        System.out.println("Prime: " + primeNumbers);

        /*
         * Obs.
         * 
         * Numerele salvate in HashSet nu garanteaza ordinea elementelor.
         * Ele sunt stocate in functie de valoarea hash.
         */

         HashSet<Integer> diff = new HashSet<>(numbers);
         diff.removeAll(primeNumbers);

         System.out.println("Diff: " + diff);
    }
}
