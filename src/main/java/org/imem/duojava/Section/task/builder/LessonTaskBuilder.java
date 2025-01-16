package org.imem.duojava.Section.task.builder;

import org.imem.duojava.Section.task.model.types.LessonTask;

public class LessonTaskBuilder {
    private int id;
    private String name;
    private String content;

    public LessonTaskBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LessonTaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LessonTaskBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public LessonTask build() {
        return new LessonTask(id, name, content);
    }
}
