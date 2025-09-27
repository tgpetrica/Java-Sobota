import java.util.*;

public class HistorianHysteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> left = new ArrayList<>();
        List <Integer> right = new ArrayList<>();

        while (sc.hasNextInt()) {
            left.add(sc.nextInt());
            if (sc.hasNextInt()) {
                right.add(sc.nextInt());
            }
        }

        Collections.sort(left);
        Collections.sort(right);

        int distance = 0;

        for (int i = 0; i < left.size(); i++) {
            distance += Math.abs(left.get(i) - right.get(i));
        }

        System.out.println(distance);
    }
}
