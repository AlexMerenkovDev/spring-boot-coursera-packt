package com.coursera.springboot.webappfrompackt.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {

    private int id;
    private String username;

    @Size(min = 10, message = "Enter atleast 10 characters")
    private String description;
    private LocalDate endDate;
    private boolean done;

    public Todo(int id, String username, String description, LocalDate endDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.endDate = endDate;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", endDate=" + endDate +
                ", done=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
