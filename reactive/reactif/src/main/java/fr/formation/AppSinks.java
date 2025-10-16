package fr.formation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class AppSinks {
    public static void main(String[] args) throws Exception {
        // On va alimenter manuellement un Flux, grâce au Sinks
        Sinks.Many<String> monSinks = Sinks.many().multicast().directAllOrNothing();

        // On récupère le Flux à partir du Sinks
        Flux<String> monFlux = monSinks.asFlux();

        // On s'abonne, on réagit aux nouveaux éléments
        monFlux.subscribe(System.out::println);

        Thread.sleep(1_000);

        // A partir du Sinks, on peut ajouter des nouveaux éléments
        monSinks.tryEmitNext("SUIVANT !");

        Thread.sleep(2_000);
        monSinks.tryEmitNext("Coucou");

        Thread.sleep(1_000);
        monSinks.tryEmitNext("Hello world");
    }
}
