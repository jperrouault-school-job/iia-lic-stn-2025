import java.util.ArrayList;
import java.util.List;

public class AppExo3 {
    public static void main(String[] args) {
        List<String> prenoms = new ArrayList<>();

        prenoms.add("Jérémy");
        prenoms.add("Alissa");
        prenoms.add("Dylan");
        prenoms.add("Ostiane");
        prenoms.add("Jérôme");

        prenoms.stream()
            .filter(prenom -> prenom.length() > 5)
            .forEach(System.out::println)
        ;
    }
}
