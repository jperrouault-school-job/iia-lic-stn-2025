package fr.formation;

import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();
    private Sinks.Many<Livre> livresSinks = Sinks.many().multicast().directAllOrNothing();

    public Flux<Livre> getLivres() {
        return livresSinks.asFlux();
    }

    public void ajouter(Livre livre) {
        // On maintient une liste des livres en plus du Sinks pour l'afficher plus facilement
        livres.add(livre);
        livresSinks.tryEmitNext(livre);
    }

    public void afficher() {
        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + ", de " + livre.getAuteur());
        }
    }
}
