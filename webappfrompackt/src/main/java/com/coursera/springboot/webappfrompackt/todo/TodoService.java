package com.coursera.springboot.webappfrompackt.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public void deleteById(int id) {
        Predicate<? super Todo> Predicate = todo -> todo.getId() == id;
        todos.removeIf(Predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> Predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(Predicate).findFirst().get();
        return todo;
    }

    public void updateById(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
