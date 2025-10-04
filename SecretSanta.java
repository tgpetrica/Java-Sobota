import java.util.*;

public class SecretSanta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> participanti = new ArrayList<>();

        System.out.println("Introdu numele participantilor: ");
        while (true) {
            String nume = sc.nextLine().trim();
            if (nume.isEmpty()) {
                break;
            }
            participanti.add(nume);
        }
        if (participanti.size() < 3) {
            System.out.println("NU sunt suficienti participanti pentru organizarea Secret Santa.");
            System.exit(0);
        }

        Map <String, String> lista = atribuire(participanti);

        System.out.println("Rezultatele atribuirii: ");
        //for (String pereche : lista.keySet()) {
        //    System.out.println(pereche + " -> " + lista.get(pereche));
        //}

        lista.forEach((cheie, valoare) -> System.out.println(cheie + " -> " + valoare));
    }

    public static Map <String, String> atribuire(List <String> participanti) {
        List<String> destinatari = new ArrayList<>(participanti);
        Map<String, String> perechi = new HashMap<>();

        while (true) {
            Collections.shuffle(destinatari);
            boolean valid = true;

            for (int i = 0; i < participanti.size(); i++) {
                if (participanti.get(i).equals(destinatari.get(i))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                break;
            }
        }
        for (int i = 0; i < participanti.size(); i++) {
            perechi.put(participanti.get(i), destinatari.get(i));
        }
        return perechi;
    }
}