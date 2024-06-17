package com.example.EventManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalTime; // Import for LocalTime datatype
import lombok.Data;

@Data
@Entity
@Table(name = "event")
public class Event {

    @Id
    private String id;
    private String title;
    private String description;
    private String startDate;
    private LocalTime startTime; // Changed to LocalTime datatype
    private String endDate;
    private String owner_id;

    // Constructors
    public Event() {
    }

    public Event(String id, String title, String description, String startDate, LocalTime startTime, String endDate, String owner_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.owner_id = owner_id;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    // toString method (optional for logging and debugging)
    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", startTime=" + startTime +
                ", endDate='" + endDate + '\'' +
                ", owner_id='" + owner_id + '\'' +
                '}';
    }
}
