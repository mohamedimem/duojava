package org.imem.duojava.Section.task;

import org.imem.duojava.Section.task.builder.LessonTaskBuilder;
import org.imem.duojava.Section.task.builder.QCMTaskBuilder;
import org.imem.duojava.Section.task.builder.TodoTaskBuilder;
import org.imem.duojava.Section.task.model.Task;
import org.imem.duojava.Section.task.model.TaskType;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {
    public Task createTask(TaskType type, TaskSpecification specification) {
        switch (type) {
            case type.qcm:
                return new QCMTaskBuilder()
                        .setId(specification.getId())
                        .setName(specification.getName())
                        .setQuestions(specification.getQuestions())
                        .build();
            case type.lesson:
                return new LessonTaskBuilder()
                        .setId(specification.getId())
                        .setName(specification.getName())
                        .setContent(specification.getContent())
                        .build();
            case type.todo:
                List<Task> subTasks = new ArrayList<>();
                // Populate subTasks based on specification
                return new TodoTaskBuilder()
                        .setId(specification.getId())
                        .setName(specification.getName())
                        .addTask(new LessonTaskBuilder().build())
                        .addTask(new QCMTaskBuilder().build())
                        .build();
            default:
                throw new IllegalArgumentException("Unknown TaskType");
        }
    }
}
