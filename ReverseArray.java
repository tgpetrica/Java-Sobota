import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Ananas");
        fruits.add("Strawberries");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherries");
        fruits.add("Kiwi");
        fruits.add("Watermelon");

        System.out.println(fruits);

        Collections.reverse(fruits);

        System.out.println(fruits);

        Collections.sort(fruits);

        System.out.println(fruits);

        Collections.sort(fruits, Collections.reverseOrder());

        System.out.println(fruits);

        Collections.shuffle(fruits);
        System.out.println(fruits);

        Collections.rotate(fruits, 2);
        System.out.println(fruits);

        Collections.replaceAll(fruits, "Watermelon", "Lime");
        System.out.println(fruits);

        fruits.add("Lime");

        System.out.println(Collections.frequency(fruits, "Lime"));
    }
}
