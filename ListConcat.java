import java.util.*;

public class ListConcat {
    public static void main(String[] args) {
        List<String> fructe = new ArrayList<>();
        fructe.add("mere");
        fructe.add("pere");
        fructe.add("caise");
        fructe.add("gutui");
        fructe.add("prune");

        List <String> legume = new ArrayList<>();
        legume.add("morcovi");
        legume.add("cartofi");
        legume.add("telina");
        legume.add("pastarnac");
        legume.add("dovlecei");
        legume.add("vinete");
        legume.add("mere");

        /*/
        List<String> lista = new ArrayList<>(fructe);

        for (String leguma : legume)
        {
            lista.add(leguma);
        }
        */

        Set<String> lista = new HashSet<>();
        lista.addAll(fructe);
        lista.addAll(legume);

        System.out.println("Fructe: " + fructe);
        System.out.println("Legume: " + legume);
        System.out.println("Lista: " + lista);

        List<String> nume = new ArrayList<>();
        nume.add ("Ion");
        nume.add ("Popescu");
        nume.add ("Ionescu");
        nume.add ("Mihailescu");
        nume.add ("Popa");
        nume.add ("Petre");

        List <String> prenume = new ArrayList<>();
        prenume.add("Teodor");
        prenume.add("Matei");
        prenume.add("Anastasia");
        prenume.add("Ion");
        prenume.add("Petre");
        prenume.add("Maria");
        
        List<String> apelative = new ArrayList<>();
        for (String n : nume)
        {
            apelative.add(n);
        }

        for (String p : prenume)
        {
            if (!apelative.contains(p))
            {
                apelative.add(p);
            }
        }

        System.out.println("Nume: " + nume);
        System.out.println("Preume: " + prenume);
        System.out.println("Comun: " + apelative);
    }
}
