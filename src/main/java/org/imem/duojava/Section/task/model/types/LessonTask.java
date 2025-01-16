package org.imem.duojava.Section.task.model.types;

import org.imem.duojava.Section.task.model.Task;

public class LessonTask extends Task {
    String content;

    public LessonTask(int id, String name, String content) {
        super(id, name);
        this.content = content;
    }

    @Override
    public void display() {
        // Display lesson content
    }

    @Override
    public void execute() {
        // Execute lesson task
    }

    @Override
    public void save() {
        // Save lesson task data
    }
}
