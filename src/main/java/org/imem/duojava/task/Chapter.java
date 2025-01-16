package org.imem.duojava.task;

import java.util.List;

public class Chapter {
    int id;
    String title;
    List<Task> tasks;
    public Chapter(int id, String title, List<Task> tasks) {
        this.id = id;
        this.title = title;
        this.tasks = tasks;
    }
}
