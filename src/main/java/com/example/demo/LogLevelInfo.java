package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LogLevelInfo {

    Logger logger = LoggerFactory.getLogger(LogLevelInfo.class.getName());

    @PostConstruct
    public void init() {
        logger.info("info log");
        logger.warn("warn log");
        logger.debug("debug log");
    }
}
