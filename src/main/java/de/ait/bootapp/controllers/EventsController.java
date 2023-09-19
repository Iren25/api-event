package de.ait.bootapp.controllers;

import de.ait.bootapp.dto.EventDto;
import de.ait.bootapp.dto.newEventDto;
import de.ait.bootapp.models.Event;
import de.ait.bootapp.services.EventsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventsController {

    private final EventsService eventsService;

    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    /* @PostMapping("/add_event")
    @ResponseBody
    public void addEvent(@RequestBody EventDto addEvent) {
        eventsService.addEvent(addEvent);
    } */


    @GetMapping("/events")
    @ResponseBody
    public List <EventDto> getAllEvents() {
        return eventsService.getAllEvents();
    }

    @PostMapping("/events")
    public void addEvent(@RequestBody newEventDto newEvent) {
        eventsService.addEvent(newEvent);
    }

}
