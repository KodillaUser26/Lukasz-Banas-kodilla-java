package com.kodilla.patterns.factory.tasks;

public interface Task {

    String executeTask(String task);
    String getTaskName();
    boolean isTaskExecuted(String task);

}