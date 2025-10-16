package fr.formation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class AppExo1 {
    public static void main(String[] args) throws Exception {
        Sinks.Many<String> sinks = Sinks.many().multicast().directAllOrNothing();
        Flux<String> flux = sinks.asFlux();

        flux.subscribe(saisie -> {
            System.out.println("L'utilisateur a saisi " + saisie);
        });

        for (int i = 0; i < 5; i = i + 1) {
            String laSaisie = System.console().readLine();
            sinks.tryEmitNext(laSaisie);
        }
    }
}
