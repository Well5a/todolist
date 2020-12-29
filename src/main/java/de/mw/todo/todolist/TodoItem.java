package de.mw.todo.todolist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue
    long Id;

    String name;

    boolean isDone;

    public TodoItem(String name, boolean isDone) {
        this.name = name;
        this.isDone = isDone;
    }

    public TodoItem() {

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}