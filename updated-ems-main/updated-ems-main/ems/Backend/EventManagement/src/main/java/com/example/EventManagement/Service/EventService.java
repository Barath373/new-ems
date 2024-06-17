package com.example.EventManagement.Service;

import com.example.EventManagement.Model.Event;
import com.example.EventManagement.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepo eventRepo;

    public String createEvent(Event event) {
        eventRepo.save(event);
        return "Event created...";
    }

    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    public Optional<Event> getEventById(String id) {
        return eventRepo.findById(id);
    }

    public String deleteEvent(String id) {
        eventRepo.deleteById(id);
        return "Deleted";
    }

    public String updateEvent(Event event) {
        Optional<Event> optionalEvent = eventRepo.findById(event.getId());
        if (optionalEvent.isPresent()) {
            Event existingEvent = optionalEvent.get();
            existingEvent.setTitle(event.getTitle());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setStartDate(event.getStartDate());
            existingEvent.setStartTime(event.getStartTime());
            existingEvent.setEndDate(event.getEndDate());

            eventRepo.save(existingEvent);
            return "Event updated successfully";
        } else {
            return "Event not found";
        }
    }
}
