package org.imem.duojava.Section;

import org.imem.duojava.Section.task.model.Task;

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
