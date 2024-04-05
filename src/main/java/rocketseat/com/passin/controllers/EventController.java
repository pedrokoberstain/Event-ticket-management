package rocketseat.com.passin.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rocketseat.com.passin.services.EventService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {
    private final EventService service;
    @GetMapping("/{id}")
    public ResponseEntity<String> getEvent(@PathVariable String id){
        this.service.getEventDetail(id);
        return ResponseEntity.ok("Sucesso!");
    }
}
