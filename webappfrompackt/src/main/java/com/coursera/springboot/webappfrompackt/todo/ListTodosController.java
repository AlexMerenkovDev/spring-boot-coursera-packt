package com.coursera.springboot.webappfrompackt.todo;

import com.coursera.springboot.webappfrompackt.login.ValidateAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes("username")
@Controller
public class ListTodosController {

    private TodoService todoService;

    public ListTodosController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos-list", method = RequestMethod.GET)
    public String gotoTodosPage(ModelMap model){

        List<Todo> todos = todoService.getAllTodosByUsername();

        System.out.println(todos);
        model.put("todosList", todos);

        return "todosList";
    }
}
