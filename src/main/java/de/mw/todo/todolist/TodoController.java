package de.mw.todo.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    Iterable<TodoItem> todo() {
        return todoService.getTodos();
    }

    @PostMapping("/{todo}")
    String addTodo(@PathVariable String todo) {
        return todoService.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    String deleteTodo(@PathVariable long id) {
        return todoService.deleteTodo(id);
    }
}
