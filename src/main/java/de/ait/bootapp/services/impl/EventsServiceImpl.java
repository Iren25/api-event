package de.ait.bootapp.services.impl;


import de.ait.bootapp.dto.EventDto;
import de.ait.bootapp.dto.newEventDto;
import de.ait.bootapp.models.Event;
import de.ait.bootapp.repositories.EventsRepository;
import de.ait.bootapp.services.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class EventsServiceImpl implements EventsService {

    private final EventsRepository eventsRepository;


    @Override
    public void addEvent(EventDto addEventDto) {
        Event event = new Event(addEventDto.getName(), addEventDto.getDescription());

        eventsRepository.save(event);
    }
    @Override
    public List<EventDto> getAllEvents() {

        List<Event> events = eventsRepository.findAll();
        List<EventDto> eventDtos = new ArrayList<>();

        for (Event event : events) {
            EventDto eventDto = new EventDto(event.getName(), event.getDescription());
            eventDtos.add(eventDto);
        }
        return eventDtos;
    }

    @Override
    public void addEvent(newEventDto newEvent) {
        Event event = new Event(newEvent.getName(), newEvent.getDescription());
        eventsRepository.save(event);

    }
}
