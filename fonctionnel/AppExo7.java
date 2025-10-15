import java.util.ArrayList;
import java.util.List;

public class AppExo7 {
    public static void main(String[] args) {
        List<String> mots = new ArrayList<>();

        mots.add("Journée");
        mots.add("Loop");
        mots.add("Parachute");
        mots.add("Casque de moto");
        mots.add("Lingot");

        mots.stream()
            // Transforme les chaines en entier : taille de chaque String
            .map(String::length)
            // Calcul la somme totale de tous les entiers : on aura la somme de chaque taille de mots
            .reduce(0, Integer::sum)
        ;
    }
}
