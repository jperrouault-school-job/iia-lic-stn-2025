import java.util.ArrayList;
import java.util.List;

public class AppExo9 {
    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>();

        Personne jeremy = new Personne();
        Personne dylan = new Personne();

        jeremy.setNom("Jérémy");
        jeremy.setAge(28);

        dylan.setNom("Dylan");
        dylan.setAge(15);

        personnes.add(jeremy);
        personnes.add(dylan);

        personnes.stream()
            .filter(personne -> personne.getAge() > 17)
            .map(personne -> personne.getNom().toUpperCase())
            .forEach(System.out::println)
        ;
    }
}
