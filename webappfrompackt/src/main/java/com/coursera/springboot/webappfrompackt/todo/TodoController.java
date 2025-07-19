package com.coursera.springboot.webappfrompackt.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@SessionAttributes("username")
@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos-list", method = RequestMethod.GET)
    public String listAllTodos(ModelMap model){

        List<Todo> todos = todoService.getAllTodosByUsername();

        System.out.println(todos);
        model.put("todosList", todos);

        return "listTodos";
    }
    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model){
        String username = (String) model.get("username");

        Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }
    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result){

        if (result.hasErrors()){
            return "todo";
        }

        String username = (String) model.get("username");
        this.todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);

        return "redirect:todos-list";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id){

        todoService.deleteById(id);

        return "redirect:todos-list";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model){
        String username = (String) model.get("username");

        Todo todo = todoService.findById(id);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result){

        if (result.hasErrors()){
            return "todo";
        }

        String username = (String) model.get("username");
        todo.setUsername(username);
        this.todoService.updateById(todo);

        return "redirect:todos-list";
    }
}
