package com.lilith.brainly.util;

import com.lilith.brainly.BrainlyApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author:JiaJingnan
 * @Date: 上午2:16 2021/7/18
 */
public class LoggerTest extends BrainlyApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info.log");
        logger.warn("warn.log");
        logger.error("error.log");


    }
}
