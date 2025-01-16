package org.imem.duojava.Section.task.builder;


import org.imem.duojava.Section.task.model.Task;
import org.imem.duojava.Section.task.model.types.TodoTask;

import java.util.ArrayList;
import java.util.List;

public class TodoTaskBuilder {
    private int id;
    private String name;
    private List<Task> subTasks;

    public TodoTaskBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public TodoTaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TodoTaskBuilder addTask(Task task) {
        if (subTasks == null) {
            subTasks = new ArrayList<>();
        }
        subTasks.add(task);
        return this;
    }

    public TodoTask build() {
        return new TodoTask(id, name, subTasks);
    }
}
