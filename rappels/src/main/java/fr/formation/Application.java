package fr.formation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();

        Formateur formateur = new Formateur();

        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant();
        Etudiant e3 = new Etudiant();

        personnes.add(formateur);
        personnes.add(e1);
        personnes.add(e2);
        personnes.add(e3);

        personnes.stream()
            // .map(Object::getClass)
            // .map(Class::getSimpleName)
            // .map(String::toUpperCase)

            .map(p -> p.getClass().getSimpleName().toUpperCase())

            .forEach(System.out::println)
        ;

        // Pour stocker des références aux méthodes
        Supplier<Class> fncGetClass = formateur::getClass;
        Consumer<String> fncPrint = System.out::println;
    }
}
