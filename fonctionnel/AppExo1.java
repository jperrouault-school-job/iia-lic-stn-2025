import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AppExo1 {
    public static void main(String[] args) {
        List<String> prenoms = new ArrayList<>();

        prenoms.add("Jérémy");
        prenoms.add("Alissa");
        prenoms.add("Dylan");
        prenoms.add("Ostiane");
        prenoms.add("Jérôme");

        prenoms.forEach(System.out::println);

        Consumer<String> print = (prenom) -> {
            System.out.println(prenom);
        };

        prenoms.forEach(print);

        prenoms.forEach(prenom -> System.out.println(prenom));
    }
}
