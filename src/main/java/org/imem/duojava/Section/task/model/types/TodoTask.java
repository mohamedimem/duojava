package org.imem.duojava.Section.task.model.types;

import org.imem.duojava.Section.task.model.Task;

import java.util.List;
public class TodoTask extends Task {
    List<Task> subTasks;

    public TodoTask(int id, String name, List<Task> subTasks) {
        super(id, name);
        this.subTasks = subTasks;
    }

    @Override
    public void execute() {
        subTasks.forEach(Task::execute);
    }

    @Override
    public void display() {
        subTasks.forEach(Task::display);
    }

    @Override
    public void save() {
        subTasks.forEach(Task::save);
    }
}