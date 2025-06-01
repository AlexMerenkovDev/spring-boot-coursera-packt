package com.coursera.springboot.webappfrompackt.todo;

import java.time.LocalDate;

public class Todo {

    private int id;
    private String username;
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
}
