import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConverter {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");

        System.out.println("ArrayList: " + languages);

        String str = languages.toString();
        System.out.println("String (toString): " + str);

        String str1 = String.join(" ", languages);
        System.out.println("String ( ): " + str1);
        String str2 = String.join(", ", languages);
        System.out.println("String (,): " + str2);
        String str3 = String.join("\t", languages);
        System.out.println("String (tab): " + str3);

        int beginIndex = 1;
        int endIndex = str.length();
        str = str.substring(beginIndex, endIndex - 1);
        System.out.println("str: " + str);
        
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(str));
        System.out.println("newList: " + newList);

    }
}
