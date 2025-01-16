package org.imem.duojava.Section.task.model;


public abstract class Task {
    int id;
    String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void display();
    public abstract void execute();
    public abstract void save();
}