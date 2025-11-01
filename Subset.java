import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        HashSet<Integer> otherNumbers = new HashSet<>();
        otherNumbers.add(2);
        otherNumbers.add(3);

        if (numbers.containsAll(otherNumbers)) {
            System.out.println("este subset");
        } else {
            System.out.println("nu este subset");
        }
    }
}
