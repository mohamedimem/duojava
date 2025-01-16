package org.imem.duojava.task;


public class Task {
    //each  task will hav
    int id;
    String name;
    TaskType type;

    public Task(int id, String name, TaskType type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
