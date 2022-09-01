package com.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {


    @Test
    void getLastLog() {
        //given
        Logger logger = Logger.INSTANCE;
        //when
        String lastLog = "123";
        logger.log(lastLog);
        //then
        Assertions.assertEquals(logger.getLastLog(), lastLog);

    }
}