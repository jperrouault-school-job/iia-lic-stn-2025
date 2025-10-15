import java.util.ArrayList;
import java.util.List;

public class AppExo2 {
    public static void main(String[] args) {
        List<String> prenoms = new ArrayList<>();

        prenoms.add("Jérémy");
        prenoms.add("Alissa");
        prenoms.add("Dylan");
        prenoms.add("Ostiane");
        prenoms.add("Jérôme");

        // Solution #1
        prenoms.stream()
            .map(prenom -> prenom.toUpperCase())
            .forEach(System.out::println)
        ;

        // Solution #2
        prenoms.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println)
        ;

    }
}
