package fr.formation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.service.MessageService;

@RestController
@RequestMapping("/api/send")
public class SenderApiController {
    private final MessageService messageService;

    public SenderApiController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public void send(@RequestParam String message) {
        this.messageService.getMessages().tryEmitNext(message);
    }
}
