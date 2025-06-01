package com.coursera.springboot.webappfrompackt.todo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static{
        todos.add(new Todo(1, "alex", "Learn Angular",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "alex", "Learn Spring",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "alex", "Learn Full Stack",
                LocalDate.now().plusYears(2), false));
    }

    public List<Todo> getAllTodosByUsername() {
        return todos;
    }
}
