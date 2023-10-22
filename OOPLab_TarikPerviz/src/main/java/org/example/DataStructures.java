package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();
    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED)
        );
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskItem> tasks) {
        this.tasks = tasks;
    }

    public void getByStatus(Status status) {
        tasks = tasks.stream()
                .filter(task -> task.getStatus()==status)
                .collect(Collectors.toList()
                );
    }

    public List<TaskItem> getByIdGreaterOrEqual(int i){
        return tasks.stream()
                .filter(task->task.getId()>=i)
                .collect(Collectors.toList());
    }

    public void printTaskDescriptions(){
        tasks.forEach(task->System.out.println(task.getPrepareForTheQuiz()));
    }

}


