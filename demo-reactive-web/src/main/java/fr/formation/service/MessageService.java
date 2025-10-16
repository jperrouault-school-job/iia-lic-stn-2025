package fr.formation.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Sinks;

@Service
public class MessageService {
    private Sinks.Many<String> messages = Sinks.many().multicast().directAllOrNothing();

    public Sinks.Many<String> getMessages() {
        return messages;
    }
}
