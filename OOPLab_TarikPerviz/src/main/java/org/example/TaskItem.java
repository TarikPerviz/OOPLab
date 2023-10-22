package org.example;

import java.util.List;
public class TaskItem {
    private int i;
    private String prepareForTheQuiz;
    private Status status;
    public TaskItem(int i, String prepareForTheQuiz, Status status) {
        this.i=i;
        this.prepareForTheQuiz=prepareForTheQuiz;
        this.status=status;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return i;
    }

    public String getPrepareForTheQuiz() {
        return prepareForTheQuiz;
    }
}
