package de.mw.todo.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoUIController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/ui")
    String list(Model model) {
        Iterable<TodoItem> todos = todoService.getTodos();
        model.addAttribute("todos", todos);
        return "todos";
    }
}
