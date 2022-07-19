package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;


@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasksList().add("one");


        //Then
        Assert.assertEquals(1, board.getToDoList().getTasksList().size());
        Assert.assertEquals(0, board.getInProgressList().getTasksList().size());
        Assert.assertEquals(0, board.getDoneList().getTasksList().size());
    }
}