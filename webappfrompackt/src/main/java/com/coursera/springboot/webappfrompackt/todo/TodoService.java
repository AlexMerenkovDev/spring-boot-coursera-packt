package com.coursera.springboot.webappfrompackt.todo;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int count = 0;

    static{
        todos.add(new Todo(++count, "alex", "Learn Angular",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++count, "alex", "Learn Spring",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++count, "alex", "Learn Full Stack",
                LocalDate.now().plusYears(2), false));
    }

    public List<Todo> getAllTodosByUsername() {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){

        Todo todo = new Todo(++count, username, description, targetDate, isDone);
        todos.add(todo);
    }
}
