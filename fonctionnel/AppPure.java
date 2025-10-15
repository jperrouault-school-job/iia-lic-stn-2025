import java.util.ArrayList;
import java.util.List;

public class AppPure {
    public static void main(String[] args) {
        // La programmation fonctionnelle utilise des fonctions pures
        // > Une fonction ne peut PAS modifier des variables externes
        // > PAS d'effet de bord
        // > Une même entrée produira la même sortie

        List<Integer> nombres = new ArrayList<>();

        nombres.add(10);
        nombres.add(2);
        nombres.add(8);
        nombres.add(5);

        // On veut calculer la somme de tous ces entiers
        // > PAS POSSIBLE, total ne peut pas être modifié dans la fonction
        // > Car la fonction ne serait plus pure : effets de bord
        // int total = 0;
        // nombres.forEach(val -> total = total + val);

        int somme = nombres.stream()
            .reduce(0, (total, val) -> total + val)
        ;

        int somme2 = nombres.stream()
            .reduce(0, Integer::sum)
        ;

        System.out.println(somme);
    }
}
