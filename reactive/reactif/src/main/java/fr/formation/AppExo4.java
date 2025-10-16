package fr.formation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class AppExo4 {
    public static void main(String[] args) throws Exception {
        Sinks.Many<String> sinks = Sinks.many().multicast().directAllOrNothing();
        Flux<String> flux = sinks.asFlux();

        flux
            // .map(saisie -> saisie.length())
            .map(String::length)
            // .scan(0, (total, nb) -> total + nb)
            // .scan((total, nb) -> total + nb)
            // .scan(0, Integer::sum)
            .scan(Integer::sum)
            .subscribe(total -> {
                System.out.println("Total = " + total);
            }
        );

        for (int i = 0; i < 5; i = i + 1) {
            String laSaisie = System.console().readLine();
            sinks.tryEmitNext(laSaisie);
        }
    }
}
