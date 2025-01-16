package org.imem.duojava.Section.task.builder;

import org.imem.duojava.Section.task.model.types.QCM.QCMTask;
import org.imem.duojava.Section.task.model.types.QCM.Question;

import java.util.List;

public class QCMTaskBuilder {
    private int id;
    private String name;
    private List<Question> questions;

    public QCMTaskBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public QCMTaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public QCMTaskBuilder setQuestions(List<Question> questions) {
        this.questions = questions;
        return this;
    }

    public QCMTask build() {
        return new QCMTask(id, name, questions);
    }
}