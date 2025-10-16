package fr.formation.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.service.MessageService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/listen")
public class ListenerApiController {
    private final MessageService messageService;

    public ListenerApiController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> listen() {
        return this.messageService.getMessages().asFlux();
    }
}
