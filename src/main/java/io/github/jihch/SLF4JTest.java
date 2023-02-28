package io.github.jihch;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(SLF4JTest.class);

    @Test
    public void test() {
        // 日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

    }

}
