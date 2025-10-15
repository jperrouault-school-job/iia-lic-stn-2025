import java.util.function.BiFunction;
import java.util.function.Consumer;

public class AppFonctionnelle {
    public static void main(String[] args) {

        // Supplier     -> Retourner un type, et qui attend 0 paramètre
        // Consumer     -> Retourne rien, et attend 1 paramètre
        // Function     -> Retourne un type, et attend 1 paramètre
        // Predicate    -> Retourne un boolean, et attend 1 paramètre

        // BiConsumer   -> Retourne rien, et attend 2 paramètres
        // BiFunction   -> Retourne un type, et attend 2 paramètres

        Maths maths = new Maths();

        // Ici, on va stocker la référence à la méthode additionner de l'instance maths
        // MAIS on ne l'exécute pas encore
        BiFunction<Integer, Integer, Integer> ope = maths::additionner;

        // Pour exécuter la méthode référencée dans ope
        int resultat =  ope.apply(5, 8);

        System.out.println(resultat);

        Consumer<String> print = System.out::println;
        print.accept(resultat + "");
    }
}
