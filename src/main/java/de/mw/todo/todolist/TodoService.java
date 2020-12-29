package de.mw.todo.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    Iterable<TodoItem> getTodos() {
        return repo.findAll();
    }

    String addTodo(String todo) {
        repo.save(new TodoItem(todo, false));
        return "added todo " + todo;
    }

    String deleteTodo( long id) {
        repo.deleteById(id);
        return "deleted todo with ID " + id;
    }
}
