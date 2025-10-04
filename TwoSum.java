import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> numere = new ArrayList<>();

        System.out.println("Introdu numerele: ");
        while(true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) break;

            try {
                int nr = Integer.parseInt(input);
                numere.add(nr);
            } catch (NumberFormatException e) {
                System.out.println("Numar invalid. Incearca din nou.");
            }
        }

        int target;
        System.out.print("Introdu valoarea target: ");
        target = sc.nextInt();

        int[] rezultat = gasestePereche(numere, target);

        if (rezultat != null) {
            System.out.println(rezultat[0] + " " + rezultat[1]);
        } else {
            System.out.println("Nu exista doua numere care sa aiba suma egala cu " + target);
        }

    }

    public static int[] gasestePereche(List<Integer> numere, int target) {
        for (int i = 0; i < numere.size(); i++) {
            for (int j = i + 1; j < numere.size(); j++) {
                if (numere.get(i) + numere.get(j) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
