package de.ait.bootapp.services;

import de.ait.bootapp.dto.EventDto;
import de.ait.bootapp.dto.newEventDto;
import de.ait.bootapp.models.Event;

import java.util.List;

public interface EventsService {

    void addEvent(EventDto addEventDto);

    List<EventDto> getAllEvents();

    void addEvent(newEventDto newEvent);
}
