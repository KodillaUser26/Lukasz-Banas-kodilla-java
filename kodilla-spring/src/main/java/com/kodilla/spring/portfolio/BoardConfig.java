package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("taskToDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("taskInProgressList")
    TaskList taskInProgressList;

    @Autowired
    @Qualifier("taskDoneList")
    TaskList taskDoneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, taskInProgressList, taskDoneList);
    }

    @Bean(name = "taskToDoList")
    @Scope("prototype")
    public TaskList getTaskToDoList() {
        return new TaskList();
    }

    @Bean(name = "taskInProgressList")
    @Scope("prototype")
    public TaskList getTaskInProgressLists() {
        return new TaskList();
    }

    @Bean(name = "taskDoneList")
    @Scope("prototype")
    public TaskList getTaskDoneList() {
        return new TaskList();
    }
}