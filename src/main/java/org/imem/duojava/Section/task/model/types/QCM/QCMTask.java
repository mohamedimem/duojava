package org.imem.duojava.Section.task.model.types.QCM;

import org.imem.duojava.Section.task.model.Task;

import java.util.List;

public class QCMTask extends Task {
    List<Question> questions;
    Answer answer;
    public QCMTask(int id, String name, List<Question> questions) {
        super(id, name);
        this.questions = questions;
    }

    @Override
    public void display() {
        // Display QCM task
    }

    @Override
    public void execute() {
        // Execute QCM task
    }

    @Override
    public void save() {
        // Save QCM task data
    }
}

